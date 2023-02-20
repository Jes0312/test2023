package com.tedu.exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
数组或list集合的方式：
从传入的若干个手机号码中，选中 n 个幸运手机号，并返回 n 个幸运手机号的号码。
 */
public class Test9 {

    public static void main(String[] args){

        System.out.println("请输入要参加的手机号");//每个手机号按逗号分开
        String s = new Scanner(System.in).next();
        String[] arr = s.split(",");
        System.out.println(Arrays.toString(arr));

        System.out.println("请输入要选取多少个手机号");
        int n = new Scanner(System.in).nextInt();


        for(int i=0;i< n;i++){

            int r = new Random().nextInt(arr.length);
            System.out.println("随机数字为："+r);
            if(arr[r]==null){
                System.out.println("没有这个号");
                i-=1;
                System.out.println("i为："+i);
                continue;
            }

            System.out.println("随机号为："+arr[r]);
            //避免重复
            arr[r]=null;
            System.out.println("更新后："+Arrays.toString(arr));
            System.out.println("i为："+i);


        }



//
//        while(true){
//
//            Scanner input = new Scanner(System.in);
//            System.out.println("请输入要参加的手机号");//每个手机号按逗号分开
//            String s = input.next();
//
//            lst.add(s);
//            System.out.println(lst);
//
//            if(s.isEmpty()){
//                lst.remove(lst.size()-1);
//                System.out.println(lst);
//
//                System.out.println("错误");
//                break;
//            }else{
//               continue;
//            }
//
//
//        }
//




    }


}
