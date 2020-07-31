package basic.hw;

import java.util.Scanner;

public class HJ105 {
    public static void main(String[] args) {
        int minusCount = 0;
        double plusCount = 0;
        int plusSum = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int v = scanner.nextInt();
            if (v < 0) {
                minusCount++;
            } else {
                plusCount++;
                plusSum = plusSum + v;
            }
        }

        System.out.println(minusCount);
        if (plusCount > 0) {
            System.out.println(String.format("%.1f",plusSum/plusCount));
        } else {
            System.out.println(0);
        }
    }
}
