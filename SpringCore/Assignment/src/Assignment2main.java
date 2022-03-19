package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment2main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Assignment1Q2.xml");
        Assignment1Q2Question  obj=(Assignment1Q2Question)context.getBean("Question");
        obj.ListDetails();//when you want to call list of answers
        //obj.SetDetails(); //To get the answers in set form
        //obj.Mapdetails();
    }
}
