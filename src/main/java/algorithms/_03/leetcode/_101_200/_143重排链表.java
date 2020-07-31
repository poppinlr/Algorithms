package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.ListNode;
import edu.princeton.cs.algs4.StdOut;

public class _143重排链表 {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        //split list into to 2 list
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        //reverse head2;
        head2 = reverseList(head2);

        //merge head1 head2
        ListNode head1 = head;
        while (head2 != null) {
            ListNode tmp = head1.next;
            head1.next = head2;

            head2 = head2.next;
            head1 = head1.next;
            head1.next = tmp;
            head1 = head1.next;
        }
    }

    private ListNode reverseList(ListNode head2) {
        if (head2 == null || head2.next == null) {
            return head2;
        }

        ListNode node = reverseList(head2.next);
        head2.next.next = head2;
        head2.next = null;

        return node;
    }

    public static void main(String[] args) {
        _143重排链表 s = new _143重排链表();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        s.reorderList(n1);

        StdOut.println(n1.val);
    }
}
