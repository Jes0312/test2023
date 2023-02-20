package com.tedu.dataStruct.binaryTreeSty;

public class BinarySearchTree<E> {
    private int size;
    private Node<E> root;

    public int size(){
        return 0;
    }
    public boolean isEmpty(){
        return false;
    }
    public void clear(){

    }
    public void add(E element){
        elementNotNullCheck(element);
        //添加第一个节点
        if(root==null){
            root = new Node(element,null);
            return;
        }
        //添加的不是第一个节点
        //找到父节点
        Node<E> parent = null;
        Node<E> node = root;
        int cmp=0;
        while(node !=null){
            cmp = compare(element,node.element);
            parent = node;
            if(cmp>0){
                node=node.right;

            }else if(cmp<0){
                //比父节点小，要与左节点比较
                node=node.left;

            }else{ //相等
                return;

            }
        }
        //看看插入到父节点的哪个位置
        Node<E> newNode = new Node<>(element,parent);
        if(cmp>0){
            parent.right=newNode;
        }else{
            parent.left=newNode;
        }
        size++;

    }
    public void remove(E element){

    }
    public boolean contains(E element){
        return false;
    }

    public void elementNotNullCheck(E element){
        if(element == null){
            throw new IllegalArgumentException("element must not be null");
        }
    }

    /*
    返回值>0，el > e2
    返回值=0，e1=e2
     */
    private int compare(E e1,E e2){

        return 0;
    }

    private static class Node<E>{
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }
    }


}
























