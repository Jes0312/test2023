package com.tedu.dataStruct.CollectionsSty.ListSty.linkedListSty;

public class MyLinkedList {
    //定义一个头节点
    Node head;
    //定义链表长度
    int size;

    class Node{
        int data;//存储真实数据
        //指针引用,指向下一个节点对象
        Node next;//下一个指针

        //无参构造函数(创建一个节点时，会初始化一个数据)
        public Node(int data){
            this.data = data;
        }

    }


    //定义一个节点
//    class Node{
//        int data;//存储真实数据
//        //指针引用,指向下一个节点对象
//        Node next;//下一个指针
//        //无参构造函数(创建一个节点时，会初始化一个数据)
//        public Node(int data){
//            this.data = data;
//        }
//
//    }

    //尾插法
    //增加节点，尾部插入的方法，在尾部增加节点
    public void addNode(int data){
        //头节点的处理(第一次插入，头节点是空)
        if(head == null){
            //创建头节点
            head = new Node(data);
            size++;
            return;
        }
        //找到尾节点
        Node temp = head;//临时节点指向头节点
        while(temp.next != null){ //头节点后面还有节点,循环直到找到尾节点（因为要在尾部插入数据）
            temp = temp.next;

        }
        //找到尾节点后，赋值
        temp.next = new Node(data);
        size++;

    }

    //根据索引删除节点
    public Node deleteNode(int index){
        //处理空链表
        if(size==0){
            return null;
        }
        //处理异常索引
        if(index<1 || index>size){
            return null;
        }

        //删除头节点
        if(index==1){
            Node temp = head;
            head = head.next;
            size--;
            return temp;
        }

        //删除非头节点
        //从头节点的下一个节点开始遍历
        Node curNode = head.next;
        //记录当前循环的节点的上一个节点，用于删除当前节点
        Node preNode = head;
        int i = 2;
        while(curNode !=null){

            if(i==index){
                preNode.next = curNode.next;
                size--;
                break;
            }else{
                preNode = curNode;
                curNode = curNode.next;
                i++;
            }
        }
        return curNode;

    }


    //打印链表：遍历、然后把每个节点打印出来
    public void printList(){
        Node curNode = head;
        //循环遍历到尾节点
        while(curNode !=null){
            System.out.println(curNode+"="+curNode.data);
            curNode = curNode.next;
        }
    }



}























