package com.modual1.bean;

import com.wjz.java.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author WuJunzhe
 * @create 2021-02-15 20:04
 */
public class Templates1 {
    //模板六：prsf
    private static final String XXX = "hello";
    private static final Customer cus = new Customer();
    //变形 psf psfi psfs
    public static final int NUM = 1;

    public static void main(String[] args) {

        //模板一:main

        //模板二:sout
        System.out.println();
        //soutp  soutm soutv xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello.main");
        //soutv就近选择变量
        int num1 = 10;
        System.out.println("num1 = " + num1);

        int num2 = 1;
        System.out.println("num2 = " + num2);

        //模板三：fori
        String[] arr = new String[]{"Bob","Jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形iter itar
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }

        //模板四: list.for
        ArrayList lists = new ArrayList();
        lists.add(1);
        lists.add(3);
        for (Object o : lists) {

        }
        //变形: list.fori list.forr
        for (int i = 0; i < lists.size(); i++) {

        }
        for (int i = lists.size() - 1; i >= 0; i--) {

        }

        //模板五：ifn
        if (lists == null) {

        }
        //变形: inn xxx.null
        if (lists != null) {


        }





    }

    public void  method1(){
        System.out.println("Hello.method1");
    }
}
