package com.tedu.exc;

import java.util.Arrays;
import java.util.Scanner;

/*
输入n个字符串，降序排列后，按照{x，y，z}格式输出
 */
public class Test13 {

    public static void main(String[] args){
        System.out.println("输入几个字符串？");
        int n = new Scanner(System.in).nextInt();
        System.out.println("输入字符串：");
        String s = new Scanner(System.in).next();
        String[] arr = s.split(",");

        for(int m=0;m<n-1;m++){

            for(int i =m;i<n-1;i++){
                String spl="";
                if (arr[m].compareTo(arr[i+1])<0){
                    spl = arr[m];
                    arr[m] = arr[i+1];
                    arr[i+1] = spl;
                }

            }
        }
        System.out.println("排序后是："+ Arrays.toString(arr));
        String str = "{";
        for(int t=0;t<n;t++){
            str += arr[t];
            str+=",";
        }
        System.out.println(str);
        String ln = str.substring(0,str.length()-1);
        ln+="}";
        System.out.println("最终结果为："+ln);

    }

}
