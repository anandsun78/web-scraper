package com.anandsundaram.spring.webscraper.repository;

import com.anandsundaram.spring.webscraper.models.WebPage;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WebPageRepository extends MongoRepository<WebPage,String> {

    public List<WebPage> findByTopicTitle(String topicTitle);
}
