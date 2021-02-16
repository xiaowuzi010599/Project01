package com.modual1.bean;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author WuJunzhe
 * @create 2021-02-15 22:12
 */
public class Templates2 {
    //psfi psfs
    public static final int NUM = 1;
    public static final String NAME = "aaa";

    /**
     *  年龄
     */
    private int age;

    /**
     *  姓名
     */
    private String name;



    private final ReentrantLock lock = new ReentrantLock();
    public void testUpdate(){
        System.out.println("xxxx");
        try{
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
        
        }
        
        for(int i = 0; i < 10; i++){
            new Thread(()->{
                //线程执行方法语句
                
            },String.valueOf(i));
        }


    }

}
