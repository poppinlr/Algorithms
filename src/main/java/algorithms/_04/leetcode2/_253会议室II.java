package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class _253会议室II {

    public int minMeetingRooms(int[][] intervals) {
        int max = 0;

        List<Integer> up = new ArrayList<>();
        List<Integer> down = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            up.add(intervals[i][0]);
            down.add(intervals[i][1]);
        }

        up.sort(Integer::compareTo);
        down.sort(Integer::compareTo);

        List<Integer> room = new ArrayList<>();
        while (up.size() > 0) {

            if (up.get(0) < down.get(0)) {
                room.add(up.get(0));
                up.remove(0);
                max = Math.max(max, room.size());
            } else {
                down.remove(0);
                room.remove(room.size() - 1);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        _253会议室II s = new _253会议室II();
        s.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}});

    }

}
