package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

public class _M14剪绳子 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode nodeH = node;

        while(node!= null){
            if(node.next.val == val){
                node.next = node.next.next;
                break;
            }

            node = node.next;
        }
        return nodeH.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        _M14剪绳子 s = new _M14剪绳子();
        s.deleteNode(node1, 5);
    }
}
