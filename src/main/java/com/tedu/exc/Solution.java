package com.tedu.exc;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args){
        Solution t15 = new Solution();
        ArrayList al1 = new ArrayList<Integer>();
        al1.add(3);
        al1.add(1);
        al1.add(9);
        al1.add(5);
        al1.add(4);
        System.out.println(al1.toString());
        ArrayList al2 = new ArrayList<Integer>();
        al2.add(30);
        al2.add(10);
        al2.add(6);
        al2.add(1);
        System.out.println(al2.toString());

        t15.test(al1,5,al2,4);


    }

    public void test(ArrayList<Integer>nums1,int m,ArrayList<Integer>nums2,int n){
        for(int i=0;i<n;i++){
            System.out.println(nums2.get(i));
            nums1.add(nums2.get(i));
        }
        System.out.println("合并后："+nums1.toString());

        for(int t=0;t<m+n-1;t++){
            for(int j=t;j<m+n-1;j++){
                Integer y=0;
                if(nums1.get(t)>nums1.get(j+1)){
                     y = nums1.get(t);
                    System.out.println("j+1为："+nums1.get(j+1));

                    nums1.set(t,nums1.get(j+1));

                    nums1.set(j+1,y);
                    System.out.println("更新后的nums1:"+nums1.toString());
                }
            }
        }
        System.out.println("最终的结果是："+ nums1.toString());
    }



}









