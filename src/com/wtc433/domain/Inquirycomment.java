package com.wtc433.domain;

public class Inquirycomment {
    private Integer id;

    private String username;

    private Integer inquiryid;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getInquiryid() {
        return inquiryid;
    }

    public void setInquiryid(Integer inquiryid) {
        this.inquiryid = inquiryid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}