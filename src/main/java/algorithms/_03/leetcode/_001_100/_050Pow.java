package algorithms._03.leetcode._001_100;

public class _050Pow {


    public double myPow(double x, int n) {

        if (n >= 0) {
            return pow(x, n);
        } else {
            return pow(x, -n);
        }
    }

    private double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }  else {
            if (n % 2 == 0) {
                return pow(x * x, n / 2);
            } else {
                return pow(x * x, n / 2) * x;
            }
        }
    }

    public int blank(int n){
        if(n<=2) {
            return 0;
        }
        return n/3+ blank(n- n/3*3);
    }

    public static void main(String[] args) {
        _050Pow s = new _050Pow();
        double t = s.myPow(2, 10);
    }
}
