package com.example.demo.Assignment1Q8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Assignment1Q8class {
    @Value("#{9}")
    private Integer X;
    @Value("#{8+8}")
    private Integer Y;
    @Autowired
    Assignment1Q8point point;

    @Override
    public String toString() {
        return "Assignment1Q8class{" +
                "X=" + X +
                ", Y=" + Y +
                ", point=" + point +
                '}';
    }


    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }
    @PostConstruct
    public void post(){
        System.out.println("postconstruct");
    }
    @PreDestroy
    public void pre(){
        System.out.println("predestroy");
    }



}
