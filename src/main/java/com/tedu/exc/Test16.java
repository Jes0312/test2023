package com.tedu.exc;

import java.util.HashMap;

public class Test16 {
    public static void main(String[] args){
        int[] nums={1,2,5,7,9};
        int tg = 9;
        test(nums,tg);

    }

    public static void test(int[] nums,int tg){
        HashMap map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length-1;i++){
            if(map.containsKey(tg-nums[i])){

                System.out.printf("下标为：%d,%d",i,map.get(tg-nums[i]));

            }else{
                map.put(nums[i],i);
            }
        }


    }

}
