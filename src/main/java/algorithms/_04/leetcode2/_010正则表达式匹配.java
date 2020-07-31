package algorithms._04.leetcode2;

public class _010正则表达式匹配 {

    public boolean isMatch(String text, String pattern) {
        //"." 匹配任何字符
        //"*"匹配零个或多个前面元素

        if (pattern.length() == 0) {
            return text.length() == 0;
        }

        //判断首字母是否相等
        boolean isMatch = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return isMatch && isMatch(text.substring(1), pattern) || isMatch(text, pattern.substring(2));
        } else {
            return isMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}
