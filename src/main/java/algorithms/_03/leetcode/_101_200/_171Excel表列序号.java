package algorithms._03.leetcode._101_200;

public class _171Excel表列序号 {

    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int ins = 0;
        for (char aChar : chars) {
            ins = ins * 26 + aChar - 'A' + 1;
        }
        return ins;
    }
}
