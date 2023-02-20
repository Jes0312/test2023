package com.tedu.exc;

/**
 * 解释： 将原字符串中连续出现的字符，按照出现次数进行压缩处理。
 * 例如：
 * 输入：AACBBBDDDDDFFX
 * 输出：A2C1B3D5F2X1
 */

public class Test5 {
    public static void main(String[] args){
        String str = "AACBBBDDDDDFFX";
        String s = "";

        int count = 1;
        for(int i =0;i<str.length();i++){

            if(i==str.length()-1){
                s = s + str.charAt(i) + count;
                break;
            }

            if(str.charAt(i)==str.charAt(i+1)){
                count+=1;
            }else{
                s = s + str.charAt(i) + String.valueOf(count);
                count=1;
            }

//            for(int n=i+1;n<str.length()-1;n++){
//                if(str.charAt(i)==str.charAt(n)){
//                    count+=1;
//                }
//            }
//            if(count>0){
//                s = s + str.charAt(i) + count;
//            }
//
      }
        System.out.println(s);
    }
}

