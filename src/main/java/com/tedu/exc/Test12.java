package com.tedu.exc;

import java.util.Scanner;

/*
输入一个整数 n，请计算并返回该整数「各位数字之积」与「各位数字之和」的差
 */
public class Test12 {

    public static void main(String[] args){
        System.out.println("请输入整数：");
        int n = new Scanner(System.in).nextInt();
        String s = String.valueOf(n);
        int sum =0;
        int mpy = 1;
        for(int i=0;i<s.length();i++){
            System.out.println("sum最初是："+sum);
            System.out.println("这个数是："+s.charAt(i));

            sum = sum + Integer.valueOf(String.valueOf(s.charAt(i)));
            System.out.println("之和为："+sum);
            mpy *= Integer.valueOf(String.valueOf(s.charAt(i)));

        }
        System.out.printf("之和为：%d，之积为：%d",sum,mpy);

    }

}
