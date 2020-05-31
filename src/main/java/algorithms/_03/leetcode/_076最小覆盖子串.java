package algorithms._03.leetcode;

public class _076最小覆盖子串 {

    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() <= 0 || t.length() <= 0 || s.length() < t.length()) {
            return "";
        } else if (t.length() == 1) {
            return t;
        } else if (t.length() == 2) {
            int lo = s.charAt(t.charAt(0));
            int hi = s.charAt(t.charAt(1));
            return s.substring(Math.min(lo, hi), Math.max(lo, hi));

        } else {
            char[] charT = t.toCharArray();


            int lot = s.indexOf(String.valueOf(t.charAt(0)));
            int hit = s.indexOf(String.valueOf(t.charAt(1)));
            int lo = Math.min(lot, hit);
            int hi = Math.max(lot, hit);
            for (int j = 2; j < charT.length; j++) {
                int mid = s.indexOf(String.valueOf(t.charAt(j)));

                if (mid < lo) {
                    lo = mid;
                } else if (mid > hi) {
                    hi = mid;
                }
            }

            return s.substring(lo, hi);
        }

    }
}
