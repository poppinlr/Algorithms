package algorithms._03.leetcode;

public class _509斐波那契数 {
    int[] memo;

    public int fib(int N) {
        if(N==0){
            return 0;
        }

        if(N==1){
            return 1;
        }

        return fib(N-1)+fib(N-2);
    }
    public int climbStairs(int n) {



        return climbStairs(n-1)+climbStairs(n-2);
    }

    public int climbStairs2(int n) {
        memo = new int[n];
        if (n == 1) {
            return 1;
        }
        memo[0] = 1;
        memo[1] = 2;
        for (int i = 3; i <= n; i++) {
            int third = memo[i-2] + memo[i-3];
            memo[i-1] = third;
//            first = second;
//            second = third;
        }
        return memo[n-1];
    }
    public static void main(String[] args) {
        _509斐波那契数 s = new _509斐波那契数();
        int i1 = s.climbStairs(45);
        int i2 = s.climbStairs2(45);
    }
}
