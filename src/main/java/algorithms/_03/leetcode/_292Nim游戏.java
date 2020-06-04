package algorithms._03.leetcode;

public class _292Nim游戏 {

    public boolean canWinNim(int n) {

        return n == 0 || n % 4 != 0;
    }
}
