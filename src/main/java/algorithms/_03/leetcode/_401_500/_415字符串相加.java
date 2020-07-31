package algorithms._03.leetcode._401_500;

public class _415字符串相加 {

    public String addStrings(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        int length = Math.max(length1, length2);
        StringBuilder sb = new StringBuilder();

        int p = 0;
        for (int i = 0; i < length; i++) {

            int n1 = length1 - i - 1 < 0 ? 0 : num1.charAt(length1 - i - 1) - '0';
            int n2 = length2 - i - 1 < 0 ? 0 : num2.charAt(length2 - i - 1) - '0';
            int sum = p + n1 + n2;
            if (sum >= 10) {
                p = 1;
            } else {
                p = 0;
            }
            sb.append(sum % 10);
        }

        if (p == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        _415字符串相加 s = new _415字符串相加();
        s.addStrings("123", "919");
    }
}
