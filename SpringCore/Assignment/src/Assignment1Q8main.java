package com.example.demo.Assignment1Q8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class Assignment1Q8main {
    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(Assignment1Q8main.class,args);
        Assignment1Q8class obj=context.getBean(Assignment1Q8class.class);
        System.out.println(obj);
    }
}
