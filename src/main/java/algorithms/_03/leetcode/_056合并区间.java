package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _056合并区间 {

    public int[][] merge(int[][] intervals) {


        intervals = new int[][]{{1, 4}, {2, 3}, {15, 18}};
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int N = intervals.length;
        int[][] merged = new int[N][2];
        int length = 0;
        for (int i = 0; i < N; i++) {
            if (length == 0 || merged[length-1][1]<intervals[i][0]) {
                merged[length++] = intervals[i];

            } else {
                merged[length - 1][1] = Math.max(merged[length - 1][1], intervals[i][1]);
            }
        }

        int[][] result = new int[length][2];
        System.arraycopy(merged, 0, result, 0, length);
        return result;
    }

//    public int[][] merge(int[][] intervals) {
//        if (intervals.length == 0) {
//            return new int[0][];
//        }
//
//        if (intervals.length == 1) {
//            return intervals;
//        }
//
//        List<int[]> l = new ArrayList<>();
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });
//
//
//        boolean[] ignore = new boolean[intervals.length];
//        int count = 0;
//        int i = 0;
//        while (i < intervals.length - 1) {
//            if (intervals[i][1] < intervals[i + 1][0]) {
//
//            } else if (intervals[i + 1][1] < intervals[i][1]) {
//                intervals[i + 1] = intervals[i];
//                ignore[i] = true;
//                count++;
//            } else {
//                intervals[i + 1][0] = intervals[i][0];
//                ignore[i] = true;
//                count++;
//            }
//            i = i + 1;
//        }
//
//        int ri = 0;
//        int[][] r = new int[intervals.length - count][];
//        for (int j = 0; j < intervals.length; j++) {
//            if (!ignore[j]) {
//                r[ri] = intervals[j];
//                ri++;
//            }
//        }
//
//        return r;
//    }

    public static void main(String[] args) {
        _056合并区间 s = new _056合并区间();
//        int[][] r = s.merge(new int[][]{new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{15, 18}});
//        int[][] r = s.merge(new int[][]{new int[]{1, 3}, new int[]{6, 9}, new int[]{2,5}});
        s.insert(new int[][]{new int[]{1, 3}, new int[]{6, 9}}, new int[]{2, 5});
    }


    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][];
        System.arraycopy(intervals, 0, res, 0, intervals.length);
        res[intervals.length] = newInterval;
        return merge(res);
    }
}
