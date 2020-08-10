package com.itutry.java;

import com.itutry.bean.Customer;

import java.util.ArrayList;

public class TemplatesTest {

    public static final int NUM = 3;
    private int age;
    private String name;


    public static final Customer CUSTOMER = new Customer();
    public static void main(String[] args) {
        String[] arr = {"Tom", "Jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = arr.length - 1; i >= 0; i--) {

        }
        for (String s : arr) {

        }
        for (int i = arr.length - 1; i >= 0; i--) {

        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        if (list != null) {

        }
        if (list != null) {

        }
        list.toArray(new Object[list.size()]);
    }

    public static int method(int a, int b) {
        int sum = a + b;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("sum = " + sum);
        System.out.println("TemplatesTest.method");

        return sum;
    }
}
