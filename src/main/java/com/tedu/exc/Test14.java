package com.tedu.exc;

import java.util.ArrayList;
import java.util.Arrays;


public class Test14 {

    public static void main(String[] args){
        int[] n1 = {1,3,10,11,0,0,0,0,0};
        int[] n2 = {1,5,7,8,9};
        int m = 4;
        int n = 5;
        test(n1,4,n2,5);

    }

    public static void test(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n -1;

        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }

        }

        System.out.println(Arrays.toString(nums1));

    }

}


