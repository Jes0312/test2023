package com.tedu.exc;

/*
给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
返回字符串中 最后一个 单词的长度。
 */
public class Test24 {

    public static void main(String[] args) {
        String s = "name,my,is,tom,green,thomas";
        System.out.println(getLength(s));

    }

    public static int getLength(String s){

        String[] arr = s.split(",");
        int l = arr.length;
        String str = arr[l-1];
        int len = str.length();

        return len;

    }

}
