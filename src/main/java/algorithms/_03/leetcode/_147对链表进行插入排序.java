package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

public class _147对链表进行插入排序 {

    public ListNode insertionSortList(ListNode head) {
        ListNode hair = new ListNode(0);

        ListNode hairNode = hair;
        while (head != null) {
            while (hairNode.next != null && head.val > hairNode.next.val) {
                hairNode = hairNode.next;
            }
            ListNode tmpNode = hairNode.next;
            ListNode tmpHead = head.next;
            hairNode.next = head;
            hairNode.next.next = tmpNode;
            hairNode = hairNode.next;
            head = tmpHead;
        }

        return hair.next;
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
