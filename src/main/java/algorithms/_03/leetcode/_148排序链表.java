package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

public class _148排序链表 {

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (slow.next != null && slow.next.next != null) {
            fast = fast.next;
            slow = slow.next.next;
        }
        ListNode head2 = fast.next;
        fast.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(head2);

        return mergeSort(l1, l2);

    }

    private ListNode mergeSort(ListNode n1, ListNode n2) {
        ListNode n = new ListNode(0);
        ListNode nn = n;
        while (n1 != null || n2 != null) {
            if (n1 == null) {
                nn.next = n2;
                n2 = n2.next;
                nn = nn.next;
            } else if(n2==null){
                nn.next = n1;
                n1 = n1.next;
                nn = nn.next;
            } else if (n1.val < n2.val) {
                nn.next = n1;
                n1 = n1.next;
                nn = nn.next;
            } else {
                nn.next = n2;
                n2 = n2.next;
                nn = nn.next;
            }
        }
        return n.next;
    }
}
