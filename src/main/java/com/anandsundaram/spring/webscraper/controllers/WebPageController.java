package com.anandsundaram.spring.webscraper.controllers;

import com.anandsundaram.spring.webscraper.models.WebPage;
import com.anandsundaram.spring.webscraper.operations.RedFlagDeals;
import com.anandsundaram.spring.webscraper.repository.WebPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class WebPageController {

    @Autowired
    private WebPageRepository repository;

    @GetMapping("/redflagdeals")
    List<WebPage> getAll (){
        try {
            return new RedFlagDeals().extractData("https://forums.redflagdeals.com/hot-deals-f9/trending","dd.total_count.total_count_selector,div.post_preview_body,h3.topictitle");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
