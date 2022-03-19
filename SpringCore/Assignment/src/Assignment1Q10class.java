package com.example.demo.Assignment1Q10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Assignment1Q10class implements ApplicationContextAware, BeanNameAware {

     private Integer X;
     private Integer Y;

    @Override
    public String toString() {
        return "Assignment1Q10class{" +
                "X=" + X +
                ", Y=" + Y +
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


     ApplicationContext context=null;
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context=context;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }
}
