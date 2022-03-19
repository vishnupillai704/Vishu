package com.example.demo.AssignmentQ6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Assignment1Q6 {
    @Value("${driverName}")
    public String ClassName;
    @Value("${Dburl}")
    public String Url;
    @Value("${username}")
    public String Username;
    @Value("${password}")
    public String Password;





    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
    public void display(){
        System.out.println("Driver : "+getClassName());
        System.out.println("URL : "+getUrl());
        System.out.println("User Name : "+getUsername());
        System.out.println("Password : "+getPassword());

    }






}
