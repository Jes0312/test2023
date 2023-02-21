package com.tedu.exc;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
 */
@Slf4j
public class Test19 {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    //public static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        String[] arr ={"abc123","abce435","abfghj","abhjgg","abhcfd"};
       // System.out.println(test(arr));
        //logger.info("TestInfo 1");
    }

    @Test(groups="test1")
    public void testAut(){
        String[] arr ={"abc123","abce435","abfghj","abhjgg","abhcfd"};
        log.info(test(arr));
        logger.info("结果："+test(arr));
        System.out.println(test(arr));
        Assert.assertEquals('1',test(arr));
    }

    public  String test(String[] arr){
        int len = arr.length;
        String pref = arr[0];
        for(int i=0;i<len;i++){

//            if(arr[i].charAt(0) != arr[i+1].charAt(0)){
//                return "";
//            }

             pref = longestCommonPrefix(pref,arr[i]);
             if(pref.length()==0){
                 break;

             }

        }
        return pref;


    }

    public static String longestCommonPrefix(String str1,String str2){

       int len = Math.min(str1.length(),str2.length());
       int index = 0;
       while(index < len && str1.charAt(index)== str2.charAt(index)){
           index++;
       }

       return str1.substring(0,index);

    }

}
