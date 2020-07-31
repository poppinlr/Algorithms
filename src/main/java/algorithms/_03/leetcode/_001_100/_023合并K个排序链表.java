package algorithms._03.leetcode._001_100;

import algorithms._03.leetcode.define.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _023合并K个排序链表 {
    //TODO 分治法
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return (o1.val - o2.val);
            }
        });

        for (ListNode node: lists) {
            queue.add(node);
        }

        ListNode head = new ListNode(0);
        ListNode m = head;
        while (!queue.isEmpty()) {
            ListNode minNode = queue.poll();
            m.next = new ListNode(minNode.val);
            m = m.next;
            if (minNode.next != null) {
                queue.add(minNode.next);
            }
        }

        return head.next;
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;

        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(4);
        n4.next = n5;
        n5.next = n6;

        ListNode n7 = new ListNode(2);
        ListNode n8 = new ListNode(6);
        n7.next = n8;



        ListNode[] listNodes = new ListNode[]{n1, n4, n7};
        _023合并K个排序链表 s = new _023合并K个排序链表();
        s.mergeKLists(listNodes);
    }
}
