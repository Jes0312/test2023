package com.tedu.exc;

/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
 */
public class Test19 {

    public static void main(String[] args) {
        String[] arr ={"abc123","abce435","abfghj","abhjgg","abhcfd"};
        System.out.println(test(arr));
    }

    public static String test(String[] arr){
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
