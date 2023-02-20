package com.tedu.exc;

public class Test28 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode deleteDUp(ListNode head){

        ListNode cur = head;
        while(cur.next != null){
            if(cur.val == cur.next.val){

            }

        }

        return null;

    }

}
