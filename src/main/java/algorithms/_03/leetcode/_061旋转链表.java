package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

public class _061旋转链表 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode lengthNode = head;
        int count = 0;
        while (lengthNode != null) {
            lengthNode = lengthNode.next;
            count++;
        }

        k = k/count;
        if (k == 0) {
            return head;
        }

        ListNode hair = new ListNode(0);
        hair.next = head;

        ListNode node1 = head;
        ListNode node2 = head;
        for (int i = 0; i < k; i++) {
            node2 = node2.next;
        }

        while (node2.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }

        hair.next = node1.next;
        node2.next = head;
        node1.next = null;

        return hair.next;
    }
}
