package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment1main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Assignment1constructor.xml");
        //ApplicationContext context=new ClassPathXmlApplicationContext("Assignment1.xml");
        Assignment1Customerclass obj=(Assignment1Customerclass) context.getBean("customer");
        obj.Details();
    }
}
