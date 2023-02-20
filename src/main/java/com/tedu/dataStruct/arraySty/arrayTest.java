package com.tedu.dataStruct.arraySty;

public class arrayTest {
    public static void main(String[] args) {
        Integer[][] arr = {{1,3,4,5},{0,9,8,7,6},{10,11,12}};
        for(int i=0;i<arr.length;i++){
            for(int t=0;t<arr[i].length;t++){
                System.out.println(arr[i][t]);
            }
        }
    }
}


