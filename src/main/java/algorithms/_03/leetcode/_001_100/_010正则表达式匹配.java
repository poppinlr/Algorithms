package algorithms._03.leetcode._001_100;

import edu.princeton.cs.algs4.StdOut;

public class _010正则表达式匹配 {

    public boolean isMatch(String text, String pattern) {

//        if (pattern.isEmpty()) return text.isEmpty();
//        boolean first_match = (!text.isEmpty() &&
//                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
//
//        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
//            return (isMatch(text, pattern.substring(2)) ||
//                    (first_match && isMatch(text.substring(1), pattern)));
//        } else {
//            return first_match && isMatch(text.substring(1), pattern.substring(1));
//        }

        if (pattern.length() == 0) {
            return text.length() == 0;
        }

        //判断首字母是否相等
        boolean isMatch = text.length() >= 1 && pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.';
        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return isMatch && isMatch(text.substring(1), pattern) || isMatch(text, pattern.substring(2));
        } else {
            return isMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        StdOut.println("abs".substring(2));

        _010正则表达式匹配 s = new _010正则表达式匹配();
        s.isMatch("aa", "a*");

    }
}
