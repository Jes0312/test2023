package com.tedu.exc;

import java.util.Scanner;

/*
输入一个整数 n，并判断是否是"回文数"；
正向读和反向读是一样的数字
 */
public class Test11 {

    public static void main(String[] args){
        System.out.println("请输入数字：");
        int n = new Scanner(System.in).nextInt();
        String s = Integer.toString(n);

        for(int i=0;i<s.length()/2;i++){
            //使用!=，不能使用!a.eqauls(b)，因为charAt返回的是字符，不是字符串
            if(!String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(s.length()-1-i)))){
                System.out.println("不是回文数");
                break;
            }
            System.out.println("结束！");

        }


    }

}
