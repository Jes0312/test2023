package com.tedu.exc;

import org.junit.Test;

import java.io.File;

/*
 *1、给定一个固定目录，然后利用文件对象提供api转换
 *2、判断是否为空目录，如有文件则遍历；判断是文件还是目录，如果是文件直接输出；
 *3、如果是目录，调用自身（参数路径、当前目录），必须有出口
 *4、遍历完成
 */
public class RecessionDir extends FileUtil {

    int a;

    public void readClassName(String dir) {
        File file = new File(dir);
        File[] files = file.listFiles();
        if (files == null || files.length == 0) {
            System.out.println(files);
            System.out.println("此目录为空");
        } else {
            for (File f : files) {
                if(file.isDirectory()){
                    readClassName(file.getAbsolutePath());
                }
                if(file.isFile()){
                    System.out.println(f.getAbsolutePath());
                }
            }
            }
        }

    @Test
    public void testRec(){
        int a =3;

        this.a=1;
        super.a=4;
        System.out.println(this.a);
        System.out.println(super.a);



        }

    }


