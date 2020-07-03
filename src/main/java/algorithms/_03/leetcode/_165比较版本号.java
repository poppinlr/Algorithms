package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class _165比较版本号 {
    public int compareVersion(String version1, String version2) {
        String[] cha1 = version1.split("\\.");
        String[] cha2 = version2.split("\\.");

        for (int i = 0; i < Math.max(cha1.length, cha2.length); i++) {
            String s1 = i >= cha1.length ? "0" : cha1[i];
            String s2 = i >= cha2.length ? "0" : cha2[i];
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);

            if (i1 > i2) {
                return 1;
            } else if (i1 < i2) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        _165比较版本号 s = new _165比较版本号();
        s.compareVersion("0.1", "1.1");
    }
}
