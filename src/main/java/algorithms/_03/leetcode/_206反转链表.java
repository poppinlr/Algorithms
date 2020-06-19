package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

public class _206反转链表 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

//    public ListNode reverseList(ListNode head) {
//        ListNode node = null;
//        while (head.next != null) {
//
//            if (node == null) {
//                node = new ListNode(head.val);
//            } else {
//                ListNode oldNode = node;
//                node = new ListNode(head.val);
//                node.next = oldNode;
//            }
//            head = head.next;
//        }
//
//        return node;
//    }
//
//    public ListNode reverseListR(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode cur = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//
//        return cur;
//    }
}
