package algorithms._04.leetcode2;

import algorithms._03.leetcode.define.ListNode;

public class _148排序链表 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //
        ListNode head1 = head;
        ListNode head2 = slow.next;
        slow.next = null;

        ListNode sortNode1 = sortList(head1);
        ListNode sortNode2 = sortList(head2);

        return merge(sortNode1, sortNode2);
    }

    private ListNode merge(ListNode n1, ListNode n2) {
        ListNode hair = new ListNode(0);
        ListNode n = hair;

        while (n1 != null || n2 != null) {
            if (n1 == null) {
                n.next = n2;
                n2 = n2.next;
                n = n.next;
            } else if (n2 == null) {
                n.next = n1;
                n1 = n1.next;
                n = n.next;
            } else if (n1.val < n2.val) {
                n.next = n1;
                n = n.next;
                n1 = n1.next;
            } else {
                n.next = n2;
                n = n.next;
                n2 = n2.next;
            }

        }
        return hair.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        _148排序链表 s = new _148排序链表();
        s.sortList(node1);

    }
}
