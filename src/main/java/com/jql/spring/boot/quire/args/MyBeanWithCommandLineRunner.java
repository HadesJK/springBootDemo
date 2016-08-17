package com.jql.spring.boot.quire.args;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/17 20:46
 */
@Component
public class MyBeanWithCommandLineRunner implements CommandLineRunner {
    public void run(String... args) {
        for (String arg : args) {
            System.out.println("=============");
            System.out.println(arg);
            System.out.println("=============");
        }
    }
}