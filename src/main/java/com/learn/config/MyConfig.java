package com.learn.config;


import com.learn.beans.MyBean;
import com.learn.beans.MyBeanConsumer;
import com.learn.util.SampleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyConfig {
    @Autowired
    MyAppProperty myAppProperty;

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean
    public MyBeanConsumer myBeanConsumer() {
        return new MyBeanConsumer(myBean());
    }
    @Bean
    public SampleUtil mySampleUtil(){
        SampleUtil sampleUtil = new SampleUtil();
        sampleUtil.setMyAppProperty(myAppProperty);
        return sampleUtil;
    }
}