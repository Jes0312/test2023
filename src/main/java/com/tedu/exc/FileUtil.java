package com.tedu.exc;

import org.junit.Test;

public class FileUtil {

    int a =0;

    public static void main(String[] args) {
        //转换为javase.spring.classes.Hello
        String fileNamePath = "D:/JAVA/JAVAPRO-SPRING1/BIN/JAVASE/Spring/Classes/Hello.class";
        Integer pos = fileNamePath.indexOf("BIN");
        System.out.println(pos);
        String s = fileNamePath.substring(pos+4);
        s = s.substring(0,s.length()-6);
        s = s.replaceAll("/",".");
        System.out.println(s);
    }

    public void sss(){}

}
