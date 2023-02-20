package com.tedu.exc;

import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    /**
     * 给定nums=[2,7,11,15] target=9
     * 找出和为9的两个整数，并返回下标
     */
    @Test
    public void test1(){
        int[] nums = {2,11,7,15};

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==9){
                    System.out.println(nums[i]+"的下标是："+i);
                    System.out.println(nums[j]+"的下标是："+(j));
            }
            }
        }

    }

    /**
     * 删除重复的元素(原地删除)
     * nums=[0,0,3,4,1,5,3,4,5]
     * 不需要考虑超出新数组长度后面的元素（是否重复正确等）
     */
    @Test
    public void test2(){
        int[] nums = {0,1,1,3,4,4,5,};

        int i = 0;                              //---
        for (int j = 1; j < nums.length; j++) { //---遍历数组
            if (nums[j] != nums[i]){//j=2 i=1
                i++;
                nums[i] = nums[j];
            }//如果nums[j] == nums[i] ，i仍为1，下一轮j=3 //j=3 i=1,不相等 nums[2]=nums[3]->[0,1,3,3,4,4,5]
        }


        System.out.println(i+1);
        System.out.println(Arrays.toString(nums));


    }

    /**
     * 移除指定元素val
     * 不使用额外的数组空间
     * 不需要考虑超出新长度后面的元素
     */

    @Test
    public void remove(){
        int[] nums = {0,2,1,1,3,4,4,5,};
        int val = 1;
        int j = 0;
        for(int i=0;i<nums.length;i++){//遍历数组，不为1的重新存到该数组(从下标为0开始重新存)，为1的就跳过不存
            if(nums[i] !=val){
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));


    }

}


