package com.jql.spring.boot.values;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/17 21:12
 */
@Configuration
@PropertySource("classpath:config/bean.properties")
public class LoadProperties {
}
