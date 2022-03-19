package com.example.demo.AssignmentQ7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication

public class Assignment1Q7main {
    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(Assignment1Q7main.class,args);
        AssignmentQ7class obj=context.getBean(AssignmentQ7class.class);
        System.out.println(obj);
    }
}
