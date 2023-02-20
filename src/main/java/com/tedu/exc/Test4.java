package com.tedu.exc;

import org.junit.Test;

public class Test4 {

    //psvm
//    public static void main(String[] args){
//        System.out.println();
//
//    }

    @Test
    public void  getString(){
        String str = "Hello Java. Javaco is a language";

        System.out.println(str.replace("Java.","c++"));
        System.out.println(str.replaceAll("Java.","c++"));
        //Java及Java后的任意两个字符都匹配（包括空格）
        System.out.println(str.replaceAll("Java..","c++"));

    }

    @Test
    public void testRound(){
        System.out.println(Math.ceil(-1.53));
    }



}
