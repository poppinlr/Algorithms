package basic.hw;

import java.util.Scanner;

public class T3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            //构建数组
            int n = Integer.parseInt(scanner.nextLine());
            String[][] mf = new String[n][n];

            //计算每行正确总值
            int total = 0;
            for (int i = 1; i <= 9; i++) {
                total = total + i;
            }
            int average = total / n;

            //初始交换行
            String[] w1 = new String[n];
            int w1Line = 0;
            String[] w2 = new String[n];
            int w2Line = 0;

            //行
            for (int i = 0; i < n; i++) {
                mf[i] = scanner.nextLine().split(" ");
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum = sum + Integer.parseInt(mf[i][j]);
                }
                if (sum == average) {
                    continue;
                } else {
                    if (w1Line == 0) {
                        w1Line = i + 1;
                        w1 = mf[i];
                    } else if (w2Line == 0) {
                        w2Line = i + 1;
                        w2 = mf[i];
                    }
                }
            }

            if (w1Line != 0 && w2Line != 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int sum = 0;
                        for (int k = 0; k < n; k++) {
                            if (k == i) {
                                sum = sum + Integer.parseInt(w2[j]);
                            } else {
                                sum = sum + Integer.parseInt(w1[k]);
                            }
                        }
                        if (sum == average) {
                            System.out.println(w1Line + " " + (i + 1) + " " + w2[j]);
                            System.out.println(w2Line + " " + (j + 1) + " " + w1[i]);
                        }
                    }
                }
                continue;
            }

            //列
            int c1Line = 0;
            int c2Line = 0;

            ////遍历两个错误的行 直到行和正确
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum = sum + Integer.parseInt(mf[j][i]);
                }
                if (sum == average) {
                    continue;
                } else {
                    if (c1Line == 0) {
                        c1Line = i + 1;
                    } else if (c2Line == 0) {
                        c2Line = i + 1;
                    }
                }
            }

            if (c1Line != 0 && c2Line != 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int sum = 0;
                        for (int k = 0; k < n; k++) {
                            if (k == i) {
                                sum = sum + Integer.parseInt(mf[j][c2Line - 1]);
                            } else {
                                sum = sum + Integer.parseInt(mf[k][c1Line - 1]);
                            }
                        }
                        if (sum == average) {
                            System.out.println((i + 1) + " " + c1Line + " " + mf[j][c2Line - 1]);
                            System.out.println((j + 1) + " " + c2Line + " " + mf[i][c1Line - 1]);
                        }
                    }
                }
            }


        }
    }
}
