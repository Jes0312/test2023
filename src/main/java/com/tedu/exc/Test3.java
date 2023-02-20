package com.tedu.exc;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        f("abc中文","GBK","D:/abc/f3");
        f("abc中文","UTF-8","D:/abc/f4");
    }

    /**
     * 字符编码encoding
     * 字符集charset
     */
    private static void f(
            String s,
            String charset,
            String path
            ) throws IOException {
        //往文件path插流
        //OSW--FOS--File/path
        FileOutputStream fos = new FileOutputStream(path);//文件地址
        //编码方式
        OutputStreamWriter out = new OutputStreamWriter(fos,charset);
        out.write(s);
        out.close();
    }
}
