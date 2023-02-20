package com.tedu.exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 测试方法栈：方法调用时会执行入栈操作,方法执行结束会自动出栈
 */
public class Test {
     public static void main(String[] args){

          doMethod();

     }

     public static void doMethod(){
          doMethod2();
     }

     public static void doMethod2() {
          Thread t = Thread.currentThread();//创建线程，同时会自动创建栈，存储这个线程种运行的方法
          StackTraceElement[] st = t.getStackTrace();//获取方法栈的栈帧(存储方法的信息)
          for(StackTraceElement s:st){
               System.out.println(s.getMethodName());
          }
     }

}















