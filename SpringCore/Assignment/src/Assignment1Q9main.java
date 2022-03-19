package com.example.demo.Assignment1Q9;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment1Q9main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Assignment1Q9.xml");
        context.registerShutdownHook();
        Assignment1Q9class obj=(Assignment1Q9class) context.getBean("Assignment");
        System.out.println(obj);

    }
}
