package com.tedu.exc;

import java.io.*;

public class Test2 {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /**
         * Unicode编码表，中文编码范围\u4e00到\u9fa5
         * 共20902个中文字符
         */
        f("GBK","D:/abc/f5");
        f("UTF-8","D:/abc/f6");
    }

    private static void f(String charset,String path) throws IOException {
        OutputStreamWriter out =
                new OutputStreamWriter(
                        new FileOutputStream(path),charset);
        int count = 0;
        for(char i='\u4e00';i<'\u9fa5';i++){
            out.write(i);
            count++;
            if(count == 30){
                out.write('\n');
                count=0;
            }
        }
        out.close();
    }

}
