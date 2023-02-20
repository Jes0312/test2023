package com.tedu.exc;

import java.util.Arrays;

/*
给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。

注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。
nums2 的长度为 n 。

 */
public class Test29 {

    public static void main(String[] args) {
        int[] nums1 = new int[11];
        nums1[1] = 3;
        nums1[2] = 4;
        nums1[3] = 5;
        nums1[4] = 9;
        nums1[5] = 13;
        int[] nums2 = {1,3,6,7,10,8};
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
        mergeArray(nums1,5,nums2,6);
    }

    public static void mergeArray(int[] nums1,int m,int[] nums2,int n){
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }

        for(int j=0;j<m+n;j++){
            for(int k=j;k<m+n;k++){
                if(nums1[j] > nums1[k]){
                    int temp = nums1[j];
                    nums1[j] = nums1[k];
                    nums1[k] = temp;
                }
            }

        }

        System.out.println("排序后："+ Arrays.toString(nums1));

    }

}
