package com.jql.spring.boot.entity;

import org.springframework.stereotype.Component;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/17 19:26
 */
@Component
public class Book {
    private String name = "Spring-Boot-Reference.pdf";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
