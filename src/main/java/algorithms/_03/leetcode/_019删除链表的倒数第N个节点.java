package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

public class _019删除链表的倒数第N个节点 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = new ListNode(0);
        h.next = head;

        ListNode node1 = h;
        ListNode node2 = h;
        for (int i = n; i > 0; i--) {
            node2 = node2.next;
        }


        while (node2.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }

        //remove node1
        ListNode t = node1.next;
        node1.next = t.next;

        return h.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        _019删除链表的倒数第N个节点 s = new _019删除链表的倒数第N个节点();
        s.removeNthFromEnd(node, 1);
    }
}
