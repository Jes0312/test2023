package com.tedu.dataStruct.stackSty;

import java.util.Stack;

public class stackTest {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(8);
        System.out.println(st);
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }
        test(4);

    }

    public static void test(int n){
        if(n>2){
            test(n-1);
        }else{
            System.out.println(n);
        }

    }






}
