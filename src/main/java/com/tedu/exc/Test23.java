package com.tedu.exc;

import java.util.Arrays;

/*
给定一个排序数组和一个目标值，在数组中找到目标值，
并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class Test23 {

    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,8,9};
        int val = 6;
        System.out.println(Arrays.toString(findValue(nums,val)));
    }

    public static int[] findValue(int[] nums,int val){

        for(int i=0;i < nums.length;i++){
            if (nums[i] == val){
                int[] res = insert(nums,i,val);
                return res;
            }
        }
        return null;
    }

    public static int[] insert(int[] nums,int index,int val){
        int n = nums.length;
        int[] nums1 = new int[n+1];

        for(int i = 0;i<nums.length;i++){
            if(i<index){
                nums1[i] = nums[i];

            }else if(i==index){
                nums1[i] = nums[index];
                nums1[i+1] = nums[index];
            }else{
                nums1[i+1] = nums[i];
            }
        }

        return nums1;
    }
}
