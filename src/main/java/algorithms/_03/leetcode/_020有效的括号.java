package algorithms._03.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _020有效的括号 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() > 0) {
                    char sp = stack.peek();
                    if (sp == map.get(c)) {
                        stack.pop();
                    } else {
                        stack.push(sp);
                    }
                } else {
                    return false;
                }

            }
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {
        _020有效的括号 s = new _020有效的括号();
        s.isValid("()");
    }
}
