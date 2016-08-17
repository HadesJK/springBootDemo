package com.jql.spring.boot.example;

import com.jql.spring.boot.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Example {

    @Resource
    private Book book;

    @RequestMapping("/")
    public String home() {
        String name = book.getName();
        return "Hello World, hello " + name + "!";
    }

}