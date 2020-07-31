package basic.hw;

import java.util.Scanner;

public class LegalIp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str = scanner.next();
            String[] ip = str.split("\\.");
            boolean flag = true;
            if (ip.length == 4) {
                for (String s : ip) {
                    int v = Integer.parseInt(s);
                    if (0 <= v && v <= 255) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


}
