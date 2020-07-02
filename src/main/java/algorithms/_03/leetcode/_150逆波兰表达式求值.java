package algorithms._03.leetcode;

import java.util.List;
import java.util.Stack;

public class _150逆波兰表达式求值 {

    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }

        if (tokens.length == 1) {
            return Integer.valueOf(tokens[0]);
        }

        Stack<Integer> numStack = new Stack<>();
//        Stack<String> symStack = new Stack<>();
        List<String> symList = List.of("+","-","*","/");
        for (int i = 0; i < tokens.length; i++) {
            if (symList.contains(tokens[i])) {
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                switch (tokens[i]) {
                    case "+" -> numStack.push(num1 + num2);
                    case "-" -> numStack.push(num1 - num2);
                    case "*" -> numStack.push(num1 * num2);
                    case "/" -> numStack.push(num2 / num1);
                }
            } else {
                numStack.push(Integer.valueOf(tokens[i]));
            }
        }
        if (numStack.isEmpty()) {
            return 0;
        }
        return numStack.pop();
    }

    public static void main(String[] args) {
        _150逆波兰表达式求值 s = new _150逆波兰表达式求值();
        s.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
    }
}
