package com.tedu.exc;

import java.util.Arrays;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 */
public class Test26 {

    public static void main(String[] args) {
        int[] ns = plusOne(123456);
        System.out.println(Arrays.toString(ns));
    }


    public static int[] plusOne(int i){

        String s = Integer.toString(i);
        System.out.println(s);
        int[] nums = new int[s.length()];
        for(int j=0;j<s.length();j++){
            Character c =s.charAt(j);
            //System.out.println("元素为："+ Integer.parseInt(c.toString()));
            nums[j] = Integer.parseInt(c.toString());
        }

        nums[nums.length-1] += 1;


        return nums;
    }


}
