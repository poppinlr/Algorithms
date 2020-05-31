package algorithms._03.leetcode;

public class _007整数反转 {

    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x/10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE/10 && pop > Integer.MAX_VALUE % 10)){
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10) {
                return 0;


            }
            reverse = reverse * 10 + pop;
        }
        return reverse;
    }
}
