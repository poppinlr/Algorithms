package algorithms._02._03._02.radix_sorts;

import java.util.Arrays;

public class _05LongestRepeatedSubstring {

    public String lrs(String s) {
        int N = s.length();
        String[] suffixes = new String[N];
        for (int i = 0; i < N; i++) {//create suffixes
            suffixes[i] = s.substring(i, N);
        }

        Arrays.sort(suffixes);//sort suffixes

        String lrs = "";
        for (int i = 0; i < N - 1; i++) {//find LCP between adjacent suffixes in sorted order
//            int len = lcp(suffixes[i], suffixes[i + 1]);
//            if (len > lrs.length()) {
//                lrs = suffixes[i].substring(0, len);
//            }
        }

        return lrs;
    }
}
