package algorithms._03.leetcode;

public class _091解码方法 {
    public int numDecodings(String s) {
        int count = 1;
        int total = 0;
        while (count <= s.length()) {
            boolean able = true;
            for (int i = 0; i < s.length(); i = i + count) {
                String sbStr = i + count <= s.length() ? s.substring(i, i + count) : s.substring(i);
                if (Integer.valueOf(sbStr) >27) {
                    able = false;
                    break;
                }
            }
            count++;
            if (able) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        _091解码方法 s = new _091解码方法();

        int t = s.numDecodings("226");
    }
}
