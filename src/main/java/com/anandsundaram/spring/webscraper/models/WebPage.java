package com.anandsundaram.spring.webscraper.models;

import org.springframework.data.annotation.Id;

public class WebPage {

    @Id
    private String id;

    private String topicTitle;
    private String topicCount;
    private String topicBody;
    private String topicLink;
    private Boolean viewed;

    public WebPage( String topicCount,String topicTitle, String topicBody, String topicLink, Boolean viewed) {

        this.topicTitle = topicTitle;
        this.topicCount = topicCount;
        this.topicBody = topicBody;
        this.topicLink = topicLink;
        this.viewed = viewed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public String getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(String topicCount) {
        this.topicCount = topicCount;
    }

    public String getTopicBody() {
        return topicBody;
    }

    public void setTopicBody(String topicBody) {
        this.topicBody = topicBody;
    }

    public String getTopicLink() {
        return topicLink;
    }

    public void setTopicLink(String topicLink) {
        this.topicLink = topicLink;
    }

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }


}
