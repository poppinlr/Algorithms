package algorithms._03.leetcode.daliy;

import algorithms._03.leetcode.define.Node;

import java.util.ArrayList;
import java.util.List;

public class 旋转矩阵 {

    public static void main(String[] args) {
        旋转矩阵 s = new 旋转矩阵();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> l = s.permute(nums);
    }

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        r(l, nums);

        return list;
    }

    private void r(ArrayList<Integer> l, int[] nums) {

        if (l.size() == nums.length) {
            list.add(new ArrayList<>(l));
            return;
        }

        //遍历选择向
        for (int i = 0; i < nums.length; i++) {
            //前序遍历， 判断是否要将nums[i] 加入l
            if (l.contains(nums[i])) {
                continue;
            }
            l.add(nums[i]);
            r(l, nums);
            //后续遍历（到达底部之后回溯
            l.remove(l.size() - 1);
        }
    }
}
