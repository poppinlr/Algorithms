package basic.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HJ93 {

    private static int total = 0;
    private static boolean flag = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String count = scanner.nextLine();
            List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            System.out.println(valid(nums));
        }
    }

    private static boolean valid(List<Integer> nums) {

        int sum3 = 0;
        int sum5 = 0;
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
            if (nums.get(i) % 5 == 0) {
                sum5 = sum5 + nums.get(i);
                nums.set(i, 0);
            } else if (nums.get(i) % 3 == 0) {
                sum3 = sum3 + nums.get(i);
                nums.set(i, 0);
            }

        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != 0) {
                list.add(nums.get(i));
            }
        }

        list.add(sum3);
        list.add(sum5);

        total = sum;
        recursive(list, 0, 0);
        return flag;
    }

    private static void recursive(List<Integer> list, int start, int sum) {
        sum = sum + list.get(start);
        if (total - sum == sum) {
            flag = true;
        }

        for (int i = start; i < list.size() - 1; i++) {
            if (!flag) {
                recursive(list, i + 1, sum);
            }
        }
    }
}
