package com.tedu.exc;

import java.util.Arrays;

/*
给你一个 升序排列 的数组 nums,请你原地删除重复出现的元素，使每个元素只出现一次,
返回删除后数组的新长度。
元素的 相对顺序 应该保持 一致 。
   p q
[1,2,2,3,3,4,5,6,6,6]
[1,2,3,3,3,4,5,6,6,6]
[1,2,3,3,3,4,5,6,6,6]
[1,2,3,3,4,4,5,6,6,6]
 */
public class Test21 {

    public static void main(String[] args){

        int[] nums = {1,2,2,3,3,4,5,6,6,6};

        int[] nums2 = new int[0];

        System.out.println(removeDupl(nums));
        System.out.println(removeDupl(nums2));

    }

    public static int removeDupl(int[] nums){
        if(nums == null||nums.length==0){
            return 0;
        }
        int p =0;
        int q =1;
        while(q<nums.length){
            if(nums[q]!=nums[p]){

                nums[p+1]=nums[q];
                p++;

            }
            q++;

        }
        System.out.println(Arrays.toString(nums));
        return p+1;
    }

}
