package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

public class _083删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode hair = new ListNode(0);
        hair.next = head;

        while (head.next != null) {
            if(head.val==head.next.val){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return hair.next;
    }
}
