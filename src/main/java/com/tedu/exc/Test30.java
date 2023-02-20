package com.tedu.exc;


import java.util.ArrayList;
import java.util.List;

/*
二叉树的中序遍历
给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 */
public class Test30 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.leftChild = new TreeNode(2);
        root.rightChild = new TreeNode(3);
        root.leftChild.leftChild = new TreeNode(4);
        root.leftChild.rightChild = new TreeNode(5);
        root.rightChild.leftChild = new TreeNode(6);
        root.rightChild.rightChild = new TreeNode(7);

        System.out.println(root);
        List<Integer> lst = orderTraversalLayer(root);
        System.out.println(lst.toString());


    }
    //中序遍历
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    //左中右
    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.leftChild, res);
        res.add(root.val);
        inorder(root.rightChild, res);
    }

    /*
    先序遍历
     */
    public static List<Integer> inorderTraversalLeft(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }

    //根左右
    public static void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.leftChild, res);

        preorder(root.rightChild, res);
    }

    //后序遍历：左右根
    public static List<Integer> orderTraversalpost(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }


    public static void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        postorder(root.leftChild, res);
        postorder(root.rightChild, res);
        res.add(root.val);
    }

    /*
    层次遍历：自上而下，从左到右
     */

    public static List<Integer> orderTraversalLayer(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        layerorder(root, res);
        return res;
    }


    public static void layerorder(TreeNode root, List<Integer> res) {
        while (root != null) {
            res.add(root.val);

        }



    }


}
