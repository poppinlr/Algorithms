package algorithms._03.leetcode._001_100;

import algorithms._03.leetcode.define.ListNode;

public class _082删除排序链表中的重复元素II {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode hair = new ListNode(head.val - 1);
        hair.next = head;

        ListNode n1 = hair;
        ListNode n2 = head;
        ListNode n3 = head.next;
        int val = hair.val;
        while (n1 != null) {

            //n2!=null n3!=null
            if (n2 != null && n3 != null) {
                if (n2.val == val) {
                    n1.next = n2.next;
                    n2 = n1.next;
                    n3 = n2 == null ? null : n2.next;
                    continue;
                }

                if (n2.val == n3.val) {
                    val = n2.val;
                    n1.next = n3.next;
                } else {
                    n1 = n1.next;
                }
                n2 = n1.next;
                n3 = n2 == null ? null : n2.next;
            }

            //n3 = null
            if (n2 != null && n3 == null) {
                if (n2.val == val) {
                    n1.next = null;
                }

                return hair.next;
            }
            //n2 = null
            if (n2 == null) {
                return hair.next;
            }
        }

        return hair.next;
    }

    public static void main(String[] args) {
        _082删除排序链表中的重复元素II s = new _082删除排序链表中的重复元素II();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(3);
//        ListNode n5 = new ListNode(3);
//        ListNode n6 = new ListNode(4);
//        ListNode n7 = new ListNode(4);
//        ListNode n8 = new ListNode(5);
        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;
//        n7.next = n8;
        ListNode n = s.deleteDuplicates(n1);
    }
}
