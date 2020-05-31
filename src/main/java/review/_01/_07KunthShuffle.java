package review._01;

import algorithms._01.CommonService;
import edu.princeton.cs.algs4.StdRandom;

public class _07KunthShuffle {

    public static void shuffle(int[] strings) {
        int N = strings.length;

        for (int i = 0; i < N; i++) {
            int random = StdRandom.uniform(i + 1);
            CommonService.exch(strings, i, random);
        }

    }
}
