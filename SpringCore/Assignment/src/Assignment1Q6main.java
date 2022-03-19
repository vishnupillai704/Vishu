package com.example.demo.AssignmentQ6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class Assignment1Q6main {
    public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("Assignment1Q6.xml");
     Assignment1Q6 obj=(Assignment1Q6) context.getBean("Assignment1Q6");
     obj.display();

      //  System.out.println(obj.user());
    }
}
