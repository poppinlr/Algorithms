package algorithms._03.leetcode._301_400;

public class _344反转字符串 {

    int i = 0;
    public void reverseString(char[] s) {
        if (i >= s.length-1-i) {
            return;
        }
        char t = s[i];
        s[i] = s[s.length-1-i];
        s[s.length-1-i] = t;
        i++;
        reverseString(s);
    }
}
