package com.example.demo.AssignmentQ7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AssignmentQ7class {
    @Value("#{8-8}")
    private Integer X;
    @Value("#{9+7}")
    private Integer Y;
    @Value("#{55/5}")
    private Integer S;

    public Integer getS() {
        return S;
    }

    public void setS(Integer s) {
        S = s;
    }



     @Autowired
    private Assignment1Q7point point;

    @Override
    public String toString() {
        return "AssignmentQ7class{" +
                "X=" + X +
                ", Y=" + Y +
                ", S=" + S +
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
}
