package algorithms._03.leetcode;

public class _043字符串相乘 {
   public String multiply(String num1, String num2) {

        int nL1 = num1.length();
        int nL2 = num2.length();

        int[] res = new int[nL1 + nL2];

        for (int i = nL1 - 1; i >= 0; i--) {
            int nC1 = num1.charAt(i) - '0';
            for (int j = nL2 - 1; j >= 0; j--) {
                int nC2 = num2.charAt(j) - '0';
                int sum = res[i + j + 1] + nC1 * nC2;
                res[i + j + 1] = sum % 10;
                res[i + j] = res[i + j] + sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (i == 0 && res[0] == 0) {
                continue;
            }
            sb.append(res[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        _043字符串相乘 s = new _043字符串相乘();
        String t = s.multiply("2", "3");
    }
}
