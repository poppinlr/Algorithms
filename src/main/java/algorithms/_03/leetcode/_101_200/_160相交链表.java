package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.ListNode;

public class _160相交链表 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA != null) {
            ListNode head = headB;
            while (head != null) {
                if (headA.equals(head)) {
                    return headA;
                } else {
                    head = head.next;
                }
            }

            headA = headA.next;
        }

        return null;
    }
}
