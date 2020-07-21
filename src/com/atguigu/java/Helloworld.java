package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("helloworld!");


//测试是不是一个人的接口

//        ArrayList list = new ArrayList();
//
//        list.add(1,1);


    String[] arr = new String[]{"tom","abc"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }





    }

    public static void method1(){

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
