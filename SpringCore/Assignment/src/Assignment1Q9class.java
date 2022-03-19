package com.example.demo.Assignment1Q9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Assignment1Q9class implements InitializingBean, DisposableBean {
    private Integer X;
    private Integer Y;

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


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialising bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroying bean");
    }
}
