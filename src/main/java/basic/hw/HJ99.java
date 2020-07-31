package basic.hw;

import java.util.Scanner;

public class HJ99 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(CalcAutomorphicNumbers(Integer.parseInt(scanner.next())));
        }
    }

    public static int CalcAutomorphicNumbers(int n) {
        /*在这里实现功能*/

        int count = 0;
        for (int i = 0; i <= n; i++) {
            int sqrt = i * i;
            if (String.valueOf(sqrt).endsWith(String.valueOf(i))) {
                count++;
            }
        }
        return count;
    }
}
