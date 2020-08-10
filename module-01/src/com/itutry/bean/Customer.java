package com.itutry.bean;

public class Customer extends Person {

    public static void main(String[] args) {
        System.out.println("Hello Word!!");
    }

    public static Customer getInstance() {
        return null;
    }

    @Override
    public void eat() {
        System.out.println("客户吃饭");
    }
}
