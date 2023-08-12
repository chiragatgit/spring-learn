package com.learn.util;

import com.learn.config.MyAppProperty;
import org.springframework.beans.factory.annotation.Value;

public class SampleUtil {

   public SampleUtil(){}
    MyAppProperty myAppProperty;
//    public SampleUtil(MyAppProperty prop) {
//        this.myAppProperty = prop;
//    }


    public void setMyAppProperty(MyAppProperty myAppProperty) {
        this.myAppProperty = myAppProperty;
    }
    public void testUtil(){
        System.out.println("name property is "+myAppProperty.toString());
    }
}
