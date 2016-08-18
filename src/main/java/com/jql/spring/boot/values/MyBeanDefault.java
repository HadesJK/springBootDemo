package com.jql.spring.boot.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/17 21:47
 */
@Component
public class MyBeanDefault {

    @Value("$appName")
    private String appName;

    @Value("$appDesc")
    private String appDesc;

    @Override
    public String toString() {
        return "MyBeanDefault{" +
                "appName='" + appName + '\'' +
                ", appDesc='" + appDesc + '\'' +
                '}';
    }


    @PostConstruct
    public void display() {
        System.out.println("---post construce---");
        System.out.println(appName);
        System.out.println(appDesc);
        System.out.println("-------------");
    }
}
