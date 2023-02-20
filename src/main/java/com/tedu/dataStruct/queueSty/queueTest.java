package com.tedu.dataStruct.queueSty;

import java.util.LinkedList;

public class queueTest {

    public static void main(String[] args) {
        LinkedList<String> que = new LinkedList<String>();
        que.add("刘备");
        que.add("关羽");
        que.add("张飞");
        System.out.println(que);
        System.out.println(que.pop());
    }

}
