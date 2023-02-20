package com.tedu.exc;

import java.util.Arrays;
import org.testng.annotations.Test;

/*
给你一个数组 nums和一个值val，你需要原地移除所有数值等于val的元素，
并返回移除后数组的新长度。

[1,2,3,1,2,6]

 */


public class Test22 {


    public static void main(String[] args) {
        int[] nums = {2,3,4,2,5,6,8};
        System.out.println(removeVal(nums,2));

    }

    @Test(groups="test1")
    public void testMethod(){
        int[] nums = {2,3,4,2,5,6,8};
        System.out.println(removeVal(nums,2));

    }


    public static int removeVal(int[] nums,int val){
        int left =0;

        //right每个循环都在+1，而left只有在right不等于val时才+1
        for(int right=0;right<nums.length;right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return left;

    }


}
