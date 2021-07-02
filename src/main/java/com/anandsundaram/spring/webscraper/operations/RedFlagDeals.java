package com.anandsundaram.spring.webscraper.operations;

import com.anandsundaram.spring.webscraper.models.WebPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RedFlagDeals implements ScrapeWebPage {
    private List<WebPage> result = new ArrayList<>();

    @Override
    public List<WebPage> extractData(String url, String query) throws IOException {
        Document doc = Jsoup.connect(url).get();
        List<String> text = doc.select("dd.total_count.total_count_selector,div.post_preview_body,h3.topictitle").stream().map(s -> s.text()).collect(Collectors.toList());
        List<String> links = doc.select("a.topic_title_link").stream().map(s -> s.text()).collect(Collectors.toList());

        for (int i = 0; i <= text.size() - 1; i += 3) {
                result.add(new WebPage(text.get(i), text.get(i + 1), text.get(i + 2), text.get(i / 3), false));
        }
        return result;
    }
}
/*
    const db = await connectDB();

    const dbData = await db.collection('UserDeals').find().toArray();

        let filterResult = result.filter(
                (val) =>
                !dbData.some(
                        (item) =>
                item.topicTitle === val.topicTitle &&
                item.topicBody === val.topicBody
        )
    );

        if (filterResult.length > 0) {
            console.log('Length greater than 0 insert');
            await db.collection('UserDeals').insertMany(filterResult);
        }
        console.log('After filter', filterResult);

    const updatedDbData = await db
                .collection('UserDeals')
                .find({ viewed: false })
      .toArray();

        await browser.close();

        res.send(updatedDbData).end();
    } catch (error) {
        res.send('Sorry there was an error ' + error).end();
    }
    }
}
*/