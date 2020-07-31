package algorithms._03.leetcode._001_100;

import algorithms._03.leetcode.define.ListNode;

public class _002两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sum = null;
        ListNode pointer = null;
        int p = 0;
        while (l1 != null && l2 != null) {
            int l1v = 0;
            int l2v = 0;
            if (l1 != null) {
                l1v = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2v = l2.val;
                l2 = l2.next;
            }

            int val = 0;
            if (l1v + l2v + p < 10) {
                val = l1v + l2v+p;
                p = 0;
            } else {
                val = (l1v + l2v+p) % 10;
                p = 1;
            }

            if (sum == null) {
                sum = new ListNode(val);
                pointer = sum;
            } else {
                pointer.next = new ListNode(val);
                pointer = pointer.next;
            }
        }

        if (p == 1) {
            pointer.next = new ListNode(1);
        }

        return sum;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        _002两数相加 s = new _002两数相加();
        ListNode l = s.addTwoNumbers(l1, l2);
    }
}
