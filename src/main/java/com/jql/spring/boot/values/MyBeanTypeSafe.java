package com.jql.spring.boot.values;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/18 10:57
 */
@Component
@ConfigurationProperties(locations = {"classpath:/config/typesafe.properties"}, prefix = "com.jql.maven")
public class MyBeanTypeSafe {

//    @Value("${name}")
    private String name;

//    @Value("${author}")
    private String author;

//    @Value("$mall}")
    private String mall;

    @Override
    public String toString() {
        return "MyBeanTypeSave{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", mall='" + mall + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall;
    }
}
