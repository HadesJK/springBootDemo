package com.jql.spring.boot.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/17 21:09
 */
@Component
public class MyBeanWithValue {

    @Value("${bean.name}")
    private String name;

    @Value("${bean.value}")
    private String value;

    @Override
    public String toString() {
        return "MyBeanWithValue{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
