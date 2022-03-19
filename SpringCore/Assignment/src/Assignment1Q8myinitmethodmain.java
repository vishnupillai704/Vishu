package com.example.demo.Assignment1Q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment1Q8myinitmethodmain {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Assignment1Q8.xml");
        context.registerShutdownHook();
        Assignment1Q8byinitmethod obj=(Assignment1Q8byinitmethod) context.getBean("Assignment");
        System.out.println(obj.getX());
    }
}
