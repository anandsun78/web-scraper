package com.anandsundaram.spring.webscraper.operations;

import com.anandsundaram.spring.webscraper.models.WebPage;

import java.io.IOException;
import java.util.List;

public interface ScrapeWebPage {

    List<WebPage> extractData(String url, String query) throws IOException;
}
