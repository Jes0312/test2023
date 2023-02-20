package com.tedu.exc;

import org.junit.Test;

import java.util.Scanner;

/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 */
public class Test17 {

    public static void main(String[] args) {
       // System.out.println(test());
        System.out.println(test2());
    }


    public static boolean test() {
        System.out.println("请输入数字：");
        int i = new Scanner(System.in).nextInt();
        String s = Integer.toString(i);
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        System.out.println(str);
        String str1 = str.toString();
        if(i==Integer.valueOf(str1)){
            return true;
        }else{
            return false;
        }

    }

    public static boolean test2(){
        System.out.println("请输入数字：");
        int i = new Scanner(System.in).nextInt();
        String s = Integer.toString(i);
        System.out.println(s);
        for(int n=0;n<=s.length()/2;n++){
            if(s.charAt(n)!=s.charAt(s.length()-n-1)) {
                return false;

            }

        }
        return true;


    }

}
