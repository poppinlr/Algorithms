package algorithms._01._02._03.shuffle;

import algorithms._01.CommonService;
import edu.princeton.cs.algs4.StdRandom;

/**
 * in iteration i, pick integer r between 0 and i uniformly at random
 * swap a[i] and a[r]
 */
public class _01KnuthShuffle {

    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(i + 1);
            CommonService.exch(a, i, r);
        }
    }
}
