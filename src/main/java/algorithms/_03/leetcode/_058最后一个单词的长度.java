package algorithms._03.leetcode;

public class _058最后一个单词的长度 {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() > 0) {
            String[] split = s.split(" ");
            return split[split.length - 1].length();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String s = "Hello  h  ";
        String[] split = s.split(" ");
    }
}
