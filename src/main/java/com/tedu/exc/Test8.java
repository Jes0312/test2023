package com.tedu.exc;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
从传入的若干个手机号码中，选中 n 个幸运手机号，并返回 n 个幸运手机号的号码。
 */
public class Test8 {


    public static void main (String[] args){

        Map map =  new HashMap<Integer,String>();
        int i = 0;

        while(true){

            System.out.println("请输入手机号：");
            String s = new Scanner(System.in).next();

            map.put(i,s);
            i+=1;
            System.out.println(map);


            if(i>5){
                break;
            }
        }

        System.out.println("请输入要抽取几个个手机号：");

        int n = new Scanner(System.in).nextInt();
        System.out.println("抽取"+n+"个手机号");
        int t = 1;
        while(true){
            int r = new Random().nextInt(6);
            System.out.println("随机数字为："+r);
            Object obj = map.get(r);
            String str = (String)obj;
            System.out.println("幸运手机号为："+ str);
            System.out.println(map.get(r));
            t+=1;
            if(t>n){
                break;
            }

        }




    }


}
