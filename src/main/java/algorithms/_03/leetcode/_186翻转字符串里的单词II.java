package algorithms._03.leetcode;

public class _186翻转字符串里的单词II {

    public void reverseWords(char[] s) {
        //反转整个数组
        reverse(s, 0, s.length - 1);

        int start = 0;
        int end = 0;
        while (end < s.length) {
            while (end < s.length && s[end] != ' ') {
                end++;
            }
            reverse(s, start, end - 1);
            end = end + 1;
            start = end;
        }
    }

    private void reverse(char[] s, int start, int end) {
        while (start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        _186翻转字符串里的单词II s = new _186翻转字符串里的单词II();
        s.reverseWords(new char[]{'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'});

    }
}
