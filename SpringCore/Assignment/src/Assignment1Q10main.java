package com.example.demo.Assignment1Q10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment1Q10main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Assignment1Q10.xml");
        Assignment1Q10class obj=(Assignment1Q10class) context.getBean("Assignment");
        System.out.println(obj);
    }
}
