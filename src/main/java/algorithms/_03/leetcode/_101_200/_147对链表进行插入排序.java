package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.ListNode;

public class _147对链表进行插入排序 {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode hair = new ListNode(0);
        while (head != null) {
            head = insert(hair, head);
        }

        return hair.next;
    }

    private ListNode insert(ListNode hair, ListNode head) {
        ListNode n = head;
        head = head.next;
        n.next = null;

        while (hair.next != null && n.val > hair.next.val) {
            hair = hair.next;
        }
        if (hair.next == null) {
            hair.next = n;
        } else {
            ListNode tmpNode = hair.next;
            hair.next = n;
            n.next = tmpNode;
        }
        return head;
    }

    public static void main(String[] args) {
        _147对链表进行插入排序 s = new _147对链表进行插入排序();
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        s.insertionSortList(n1);
    }
}
