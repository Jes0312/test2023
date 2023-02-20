package com.tedu.exc;

import java.util.HashMap;
import java.util.Scanner;

/*
 罗马数字转整数
 */
public class Test18 {

    public static void main(String[] args) {
        System.out.println(romeToInt("XIV"));

    }

    public static int romeToInt(String s){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int value = map.get(s.charAt(i));
            if(i<s.length()-1 && value<map.get(s.charAt(i+1))){
                sum -= value;

            }else{
                sum += value;
            }

        }
        return sum;

        }

    }



