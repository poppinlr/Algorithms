package basic.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ41 {

    private static int staticN = 0;
    private static List<Integer> r = new ArrayList<>();
    private static List<Integer> numList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine());
            String[] weightStr = scanner.nextLine().split(" ");
            int[] weight = new int[weightStr.length];
            for (int i = 0; i < weightStr.length; i++) {
                weight[i] = Integer.parseInt(weightStr[i]);
            }

            String[] numsStr = scanner.nextLine().split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            r.add(0);//init 0
            System.out.println(fama(n, weight, nums));
        }
    }


    public static int fama(int n, int[] weight, int[] nums) {
        staticN = n;
        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                numList.add(weight[i]);
            }
        }
        recursive(0, 0);

        return r.size();
    }

    private static void recursive(int start, int sum) {
        sum = sum + numList.get(start);
        if (!r.contains(sum)) {
            r.add(sum);
        }

        for (int i = start; i < numList.size() - 1; i++) {
            recursive(i + 1, sum);
        }
    }
}
