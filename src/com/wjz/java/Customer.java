package com.wjz.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Customer {
    //你好
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        System.out.println("helloWorld!!!!");

        try {
            FileInputStream f = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
