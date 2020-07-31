package algorithms._03.leetcode._001_100;

import algorithms._03.leetcode.define.ListNode;

public class _021合并两个有序链表 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                node.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                node.next =l1;
                l1 = l1.next;
            } else {
                int v1 = l1.val;
                int v2 = l2.val;
                if (v1 < v2) {
                    node.next = l1;
                    l1 = l1.next;
                } else {
                    node.next = l2;
                    l2 = l2.next;
                }
            }
            node = node.next;
        }
        return head.next;
    }

}
