package algorithms.js;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5467找到最接近目标值的函数值 {

    public int closestToTarget(int[] arr, int target) {


        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            ans = ans & arr[i];
            list.add(ans);
        }

        return min;
    }

    public int func(int[] arr, int l, int r) {
        if (r < l) {
            return -100000;
        }

        int ans = arr[l];
        for (int i = l + 1; i <= r; i++) {
            ans = ans & arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        _5467找到最接近目标值的函数值 s = new _5467找到最接近目标值的函数值();
        s.closestToTarget(new int[]{9,12,3,7,15}, 0);
    }
}
