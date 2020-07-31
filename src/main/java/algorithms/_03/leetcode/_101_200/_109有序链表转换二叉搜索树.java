package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.ListNode;
import algorithms._03.leetcode.define.TreeNode;

public class _109有序链表转换二叉搜索树 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next==null) {
            return new TreeNode(head.val);
        }


        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        if(head2==null){
            return null;
        }
        TreeNode root = new TreeNode(head2.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(head2.next);

        return root;
    }

    public static void main(String[] args) {
        _109有序链表转换二叉搜索树 s = new _109有序链表转换二叉搜索树();
        ListNode n1 = new ListNode(-10);
        ListNode n2 = new ListNode(-3);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        TreeNode n = s.sortedListToBST(n1);
    }
}
