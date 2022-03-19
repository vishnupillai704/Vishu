package com.example.demo;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Assignment1Q5 {
    @Inject
    Assignment1Q5point point;

    public Assignment1Q5point getPoint() {
        return point;
    }

    public void setPoint(Assignment1Q5point point) {
        this.point = point;
    }
    public void draw(){
        System.out.println(point.getX()+point.getY());
    }
}
