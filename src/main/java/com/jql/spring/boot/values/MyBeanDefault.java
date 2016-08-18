package com.jql.spring.boot.values;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/17 21:47
 */
@Component
public class MyBeanDefault {

    @Autowired
    private Environment env;

    @Value("${appName}")
    private String appName;

    @Value("${appDesc}")
    private String appDesc;

    @Value("${placeHolder}")
    private String placeHolder;

    @Override
    public String toString() {
        return "MyBeanDefault{" +
                "appName='" + appName + '\'' +
                ", appDesc='" + appDesc + '\'' +
                ", placeHolder='" + placeHolder + '\'' +
                '}';
    }

    @PostConstruct
    public void display() {
        System.out.println("---post construce---");
        System.out.println(appName);
        System.out.println(appDesc);
        System.out.println("-------------");

        System.out.println("@@@===@@@");
        System.out.println(env.getProperty("appName"));
        System.out.println(env.getProperty("appDesc"));
        System.out.println("@@@===@@@");
    }
}
