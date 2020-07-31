package algorithms._03.leetcode._001_100;

import java.util.Stack;

public class _032最长有效括号 {

    //TODO dp
//    public int longestValidParentheses(String s) {
//        int maxans = 0;
//        Stack<Integer> stack = new Stack<>();
//        stack.push(-1);
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                stack.push(i);
//            } else {
//                stack.pop();
//                if (stack.empty()) {
//                    stack.push(i);
//                } else {
//                    maxans = Math.max(maxans, i - stack.peek());
//                }
//            }
//        }
//        return maxans;
//    }

    public int longestValidParentheses(String s) {
        int i = 0;
        int max = 0;
        int right = 0;
        Stack<Character> stack = new Stack<>();
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    right = 0;
                } else {
                    right++;
                    max = Math.max(max, right * 2);
                    stack.pop();
                }
            }
            i++;
        }

        return max;
    }




    public static void main(String[] args) {
        _032最长有效括号 s = new _032最长有效括号();
        s.longestValidParentheses("()(()");
    }
}
