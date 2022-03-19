package com.example.demo;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Assignment1Q5point {
    private Integer X;
    private Integer Y;

    public Integer getX() {
        return X;
    }
     @Resource(name = "point")
    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }
   @Resource(name = "point")
    public void setY(Integer y) {
        Y = y;
    }



}
