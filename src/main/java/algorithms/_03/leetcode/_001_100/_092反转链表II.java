package algorithms._03.leetcode._001_100;

import algorithms._03.leetcode.define.ListNode;


public class _092反转链表II {

    private ListNode node;

    //core
    public ListNode reverseN(ListNode head, int n) {
        if (n == 1) {//1
            node = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = node;
        return last;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {//1
            return reverseN(head, n);
        }

        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }
}
