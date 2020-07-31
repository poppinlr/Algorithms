package algorithms._03.leetcode._001_100;

import algorithms._03.leetcode.define.ListNode;

public class _086分隔链表 {

    public ListNode partition(ListNode head, int x) {
        ListNode node1H = new ListNode(0);
        ListNode node1 = node1H;
        ListNode node2H = new ListNode(0);
        ListNode node2 = node2H;

        ListNode node = head;

        while (node != null) {
            if (node.val < x) {
                node1.next = node;
                node1 = node1.next;
            } else {
                node2.next = node;
                node2 = node2.next;
            }

            node = node.next;
        }

        node1.next = node2H.next;
        node2.next = null;
        return node1H.next;
    }
}
