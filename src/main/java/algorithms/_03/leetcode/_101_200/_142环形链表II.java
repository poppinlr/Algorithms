package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.ListNode;

public class _142环形链表II {

    public ListNode detectCycle(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;

        while (true) {
            if(node1 == null || node1.next == null){
                return null;
            }
            node1 = node1.next.next;
            node2 = node2.next;
            if (node1.equals(node2)) {
                break;
            }
        }

        node2 = head;
        while (!node1.equals(node2)){

            node2 = node2.next;
            node1 = node1.next;
        }

        return node1;
    }
}
