package algorithms._03.leetcode._501_600;

public class _557反转字符串中的单词III {
    public String reverseWords(String s) {
        String[] strArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String value : strArray) {
            sb.append(new StringBuilder(value).reverse());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
