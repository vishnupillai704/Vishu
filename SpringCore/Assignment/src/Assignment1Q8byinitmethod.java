package com.example.demo.Assignment1Q8;

public class Assignment1Q8byinitmethod  {
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
     public void init(){
         System.out.println("initializing bean");
     }
     public void destroy(){
         System.out.println("destroying bean");
     }
}
