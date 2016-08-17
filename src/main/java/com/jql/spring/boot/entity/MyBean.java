package com.jql.spring.boot.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/17 20:29
 */
@Component
public class MyBean {

    @Autowired
    public MyBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        files.stream().forEach(str -> {
            System.out.println("@@@@@@@@@@@");
            System.out.println(str);
            System.out.println("@@@@@@@@@@@");
        });
    }
}
