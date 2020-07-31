
import java.util.Scanner;

public class HJ63 {

    private static int max = -1;
    private static String DNA;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int count = Integer.parseInt(scanner.nextLine());
            scann(line, count);
        }
    }

    private static void scann(String line, int count) {
        if (count >= line.length()) {
            System.out.println(line);
        } else {
            int sum = 0;
            for (int i = 0; i < count; i++) {
                if (line.charAt(i) == 'C' || line.charAt(i) == 'G') {
                    sum++;
                }
            }
            max = sum;
            DNA = line.substring(0, count);
            for (int i = count; i < line.length(); i++) {
                if (line.charAt(i) == 'C' || line.charAt(i) == 'G') {
                    sum++;
                }

                if (line.charAt(i - count) == 'C' || line.charAt(i - count) == 'G') {
                    sum--;
                }

                if (sum > max) {
                    max = sum;
                    DNA = line.substring(i - count + 1, i + 1);
                }
            }
            System.out.println(DNA);
        }
    }
}