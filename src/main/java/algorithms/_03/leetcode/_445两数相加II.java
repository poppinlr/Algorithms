package algorithms._03.leetcode;

import algorithms._03.leetcode.define.ListNode;

import java.util.List;
import java.util.Stack;

public class _445两数相加II {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        while (l1 != null) {
            stack1.push(l1);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2);
            l2 = l2.next;
        }

        int plus = 0;
        Stack<ListNode> stack3 = new Stack<>();
        while (!stack1.isEmpty()|| !stack2.isEmpty()) {
            int sum = (stack1.isEmpty() ? 0 : stack1.pop().val)
                    + (stack2.isEmpty() ? 0 : stack2.pop().val) + plus;
            ListNode node = new ListNode(sum % 10);
            stack3.push(node);
            plus = sum/10;
        }

        ListNode node = null;
        if (plus > 0) {
            node = new ListNode(plus);
        } else {
            node = stack3.pop();
        }

        ListNode m = node;

        while (!stack3.isEmpty()) {
            m.next = stack3.pop();
            m = m.next;
        }

        return node;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);

        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n5.next = n6;
        n6.next = n7;

        _445两数相加II s = new _445两数相加II();
        s.addTwoNumbers(n1, n5);
    }
}
