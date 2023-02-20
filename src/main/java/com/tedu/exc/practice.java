package com.tedu.exc;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        f1();

    }

    private static void f1(){
        System.out.println("请输入两个浮点数");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        try{
            double r = divide(a,b);
            System.out.println(r);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("不能除0");
            return;
        }finally{
            System.out.println("1111111");
        }

        System.out.println("3333");

    }

    private static double divide(double a, double b){
        if(b==0){
            ArithmeticException e1 = new ArithmeticException("/ by zero");//给程序员看的
            throw e1;  //这里如果不抛出并捕获异常，系统将抛出Infinity错误，并且阻塞不往下执行（卡在b==0这里）。因为这里只提示Infinity，所以要手动抛出异常，抛给出错的这一步，即divide()，同时要try捕获这样才不会阻塞
        }

        return a/b;
    }

    //==
    //基本数据类型：比较的是值
    //引用数据类型：比较的是堆内存地址，他们在内存中的存放地址
    //注意：如果是同一个new出来的对象（在堆内存中是同一个区域），比较的结果为true,否则为false,因为每new一次，都会重新开辟堆内存空间
    /***********/
    //不能用于基本数据类型比较，继承于Object这个超类，只有引用数据类型才有equals方法。
    //在一些类库当中这个方法被重写了，如String、Integer、Date。在这些类当中equals有其自身的实现
    // （一般都是用来比较对象的成员变量值是否相同），而不再是比较类在堆内存中的存放地址了。
    //对于引用型变量进行equals比较，在没有重写equals方法的情况下，他们之间的比较还是内存中的存放位置的地址值，
    // 跟双等号（==）的结果相同；如果被重写，按照重写的要求来。

    /***********/
    //基本数据类型： byte、short、long、int、float、double、char、boolean
    //引用数据类型非常多，大致包括：类、 接口类型、 数组类型、 枚举类型、 注解类型、 字符串型
    //例如，String类型就是引用类型，还有Double，Integer,Byte,Long,Float,Char,Boolean,Short（注意这里和基本类型相比首字母是大写）
    //简单来说，所有的非基本数据类型都是引用数据类型
    @Test
    public void testNumType(){

        Integer I = 127;
        int i = 3;
        //装箱 vlaueOf（）
        Integer I1 = Integer.valueOf(i);
        System.out.println(I1);
        //拆箱 xxxValue
        int i1 = I.intValue();
        System.out.println(i1);


    }



}


