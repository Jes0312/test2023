package com.tedu.exc;

import java.util.HashMap;
import java.util.Stack;

/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。
 */
public class Test20 {

    public static void main(String[] args) {
        System.out.println( isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s){
        HashMap map = new HashMap<Character,Character>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        char[] arr = s.toCharArray();

        Stack stack = new Stack();

        for(Character c : arr){
            //先判断是否为左括号，是的话,将这个左括号入栈
            if(map.containsValue(c)){
                stack.push(c);
            }else{
                //如果是有效的，则栈中最顶上的字符与数组中第一个右括号是一对
                if(stack.peek() == map.get(c)){
                    stack.pop();

                }else{
                    return false;
                }

            }
        }
        return stack.size() ==0;



    }

}
