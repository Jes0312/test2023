package com.tedu.exc;

public class Test15 {

    public static void main(String[] args){
        int[] nums = {1,9,3,4,5};
        int tg = 8;
        twoSum(nums,tg);

    }

    public static int[] twoSum(int[] nums,int target){
        int[] arr = {};
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("下标为："+i+","+j);
                    arr = new int[]{i,j};
                }


            }

        }

        return arr;

    }

}
