package basic.hw;

import java.util.Scanner;

public class HJ104 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNext()) {
            int count = Integer.parseInt(scanner.nextLine());
            while (count > 0) {
                count--;
                String line = scanner.nextLine();
                append(line, sb);
            }
        }
        System.out.println(sb.toString());
    }

    private static void append(String line, StringBuilder sb) {
        if (line.length() <= 8) {
            for (int i = 0; i < 8; i++) {
                sb.append(i > line.length() - 1 ? "0" : line.charAt(i));
            }
            sb.append("\n");
        } else {
            sb.append(line.substring(0, 8) + "\n");
            append(line.substring(8), sb);
        }
    }
}
