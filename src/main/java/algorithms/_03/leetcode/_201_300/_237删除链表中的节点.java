package algorithms._03.leetcode._201_300;

import algorithms._03.leetcode.define.ListNode;

public class _237删除链表中的节点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
