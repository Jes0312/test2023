package com.tedu.exc;

/*
爬楼梯
 */
public class Test27 {

    public static void main(String[] args) {
        System.out.println(climbStr(3));
    }

    public static int climbStr(int n){

        if(n ==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return climbStr(n-1) + climbStr(n-2);
        }

    }

}
