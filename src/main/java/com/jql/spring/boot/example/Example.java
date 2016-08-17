package com.jql.spring.boot.example;

import com.jql.spring.boot.entity.Book;
import com.jql.spring.boot.entity.DeskWithBook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Example {

    @Resource
    private Book book;

    @Resource
    private DeskWithBook desk;

    @RequestMapping("/")
    public String home() {
        String name = book.getName();
        return "Hello World, hello " + name + "!";
    }

    @RequestMapping("/desk")
    public String desk() {
        String name = desk.getName();
        String bookName = desk.getBook().getName();

        return "desk name: " + name + ", book name: " + bookName;
    }

}