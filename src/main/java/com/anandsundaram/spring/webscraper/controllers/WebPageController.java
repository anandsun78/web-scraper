package com.anandsundaram.spring.webscraper.controllers;

import com.anandsundaram.spring.webscraper.models.WebPage;
import com.anandsundaram.spring.webscraper.repository.WebPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebPageController {

    @Autowired
    private WebPageRepository repository;

    @GetMapping("/redflagdeals")
    List<WebPage> getAll (){
       return repository.findAll();
    }

}
