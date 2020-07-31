package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _056合并区间 {
    public int[][] merge(int[][] intervals) {

        List<List<Integer>> r = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        r.add(List.of(intervals[0][0], intervals[0][1]));
        for (int i = 1; i < intervals.length - 1; i++) {
            List<Integer> l1 = r.get(r.size() - 1);
            List<Integer> l2 = List.of(intervals[i][0], intervals[i][1]);

            if (l2.get(0) <= l1.get(1)) {
                r.get(r.size() - 1).set(0, Math.min(l1.get(0), l2.get(0)));
                r.get(r.size() - 1).set(1, Math.max(l1.get(1), l2.get(1)));
            } else {
                r.add(l2);
            }
        }

        int[][] rArray = new int[r.size()][];
        for (int i = 0; i < r.size(); i++) {
            rArray[i] = new int[]{r.get(i).get(0), r.get(i).get(1)};
        }

        return rArray;
    }
}
