package algorithms._03.leetcode;

public class _009回文数 {

    public boolean isPalindrome(int x) {

        if (x < 0 || x % 10 == 0 && x != 0) return false;

        int right = 0;
        int left = x;
        while (left > right) {
            right = right * 10 + left % 10;
            left = left / 10;
        }

        return left == right || left / 10 == right;
    }

    public static void main(String[] args) {
        _009回文数 s = new _009回文数();
        s.isPalindrome(0);

    }
}
