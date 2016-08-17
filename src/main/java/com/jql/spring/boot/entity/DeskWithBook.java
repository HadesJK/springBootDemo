package com.jql.spring.boot.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/17 19:37
 */
@Component
public class DeskWithBook {

    private String name = "desk";

    private final Book book;

    @Autowired
    public DeskWithBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public String getName() {
        return name;
    }
}
