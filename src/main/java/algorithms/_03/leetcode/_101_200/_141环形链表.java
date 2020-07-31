package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.ListNode;

public class _141环形链表 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            if (fast == null || slow == null || fast.next == null || fast.next.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast.equals(slow)) {
                return true;
            }
        }
    }
}
