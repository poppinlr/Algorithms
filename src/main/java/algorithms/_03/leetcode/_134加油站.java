package algorithms._03.leetcode;

public class _134加油站 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (cost == null || cost.length == 0) {
            return -1;
        }

        if (cost.length == 1) {
            if (gas[0] > cost[0]) {
                return 0;
            } else {
                return -1;
            }
        }

        int start = 0;

        while (start < gas.length) {
            int oil = 0;
            for (int i = 0; i < gas.length; i++) {
                int index = (start + i) % gas.length;
                oil = oil + gas[index];
                if (oil >= cost[index]) {

                    if (i == gas.length - 1) {
                        return start;
                    } else {
                        oil = oil - cost[index];
                    }
                } else {
                    break;
                }
            }
            start++;
        }

        return -1;
    }

    public static void main(String[] args) {
        _134加油站 s = new _134加油站();
        int t = s.canCompleteCircuit(new int[]{3, 3, 4}, new int[]{3, 4, 4});
    }
}
