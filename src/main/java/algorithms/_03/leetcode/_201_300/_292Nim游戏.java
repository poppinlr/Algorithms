package algorithms._03.leetcode._201_300;

public class _292Nim游戏 {

    public boolean canWinNim(int n) {

        return n == 0 || n % 4 != 0;
    }
}
