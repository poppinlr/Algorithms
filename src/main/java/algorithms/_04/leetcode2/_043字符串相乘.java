package algorithms._04.leetcode2;

public class _043字符串相乘 {

    public String multiply(String num1, String num2) {
        StringBuilder sum = new StringBuilder();
        if (num1.startsWith("0") || num2.startsWith("0")) {
            return "0";
        }
        if (num2.length() > num1.length()) {
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        int[] result = new int[num1.length() + num2.length() + 1];
        int flag = 0;
        for (int i = 0; i < num2.length(); i++) {
            for (int j = 0; j < num1.length(); j++) {
                int int1 = num1.charAt(i) - '0';
                int int2 = num2.charAt(j) - '0';
                int total = (int1 * int2 + result[i + j] + flag);
                result[i + j] = total % 10;
                flag = total / 10;
            }
            if (flag > 0) {
                result[num1.length() + i] = flag;
                flag = 0;
            }
        }

        for (int i = result.length - 1; i >= 0; i--) {
            if (i == result.length - 1 && result[i] == 0) {
                continue;
            }
            sum.append(result[i]);
        }
        return sum.toString();
    }

    public static void main(String[] args) {
        _043字符串相乘 s = new _043字符串相乘();
        s.multiply("99", "99");
    }
}
