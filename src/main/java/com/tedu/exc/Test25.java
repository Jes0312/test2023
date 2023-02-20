package com.tedu.exc;



import java.util.Arrays;

public class Test25 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,1,4,6,5};
        System.out.println(Arrays.toString(removeVal(nums,3)));

    }

    public static int[] removeVal(int[] nums,int val){

        for(int i=0;i<=nums.length-1;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[j+1]<nums[i]){
                    int a = nums[j+1];
                    nums[j+1] =nums[i];
                    nums[i] = a;
                }
            }
        }

        System.out.println("排序后："+ Arrays.toString(nums));

        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){

                return remArr(nums,i);
            }

        }

        return null;

    }

    public static int[] remArr(int[] nums,int n){

        int[] nums1 = new int[nums.length - 1];
        for(int i=0;i<nums.length-1;i++){
            if(i<n){
                nums1[i] = nums[i];
            }else if(i>n){
                nums1[i] = nums[i+1];
            }
        }

        return nums1;
    }



}
