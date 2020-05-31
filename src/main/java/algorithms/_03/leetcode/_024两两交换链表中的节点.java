package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

public class _024两两交换链表中的节点 {

    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if (head.next == null) {
            return head;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode p = node;

        while (p.next!=null&&p.next.next != null) {
            swarp(p);
            p = p.next.next;
        }

        return node.next;

    }

    private void swarp(ListNode node) {
        ListNode n1 = node.next;
        ListNode n2 = node.next.next;
        ListNode n3 = node.next.next.next;
        node.next = n2;
        n2.next = n1;
        n1.next = n3;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        _024两两交换链表中的节点 s = new _024两两交换链表中的节点();
        ListNode n = s.swapPairs(n1);
    }

}
