package algorithms._04.leetcode2;

public class _091解码方法 {

    public int numDecodings(String s) {
        if (s.startsWith("0")) {
            return 0;
        }
        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            if (s.charAt(0) == '0') {
                return 0;
            } else {
                return 1;
            }
        }

        if (s.length() == 2) {
            return num(s);
        }

        int sum = num(s.substring(0, 2));
        if (sum == 0) {
            return 0;
        } else {
            for (int i = 2; i < s.length(); i++) {
                if (num(s.substring(i - 1, i + 1)) == 0) {
                    return 0;
                } else {
                    sum = sum + num(s.substring(i - 1, i + 1)) - 1;
                }
            }
        }


        return sum;
    }

    private int num(String s) {
        //20->1
        //31->1
        //30->0
        //25->2
        //02->0

        char c1 = s.charAt(0);
        char c2 = s.charAt(1);
        if (c1 <= '2' && c2 <= '6') {
            if (c1 == '0'||c2 == '0') {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (c2 == '0') {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        _091解码方法 s = new _091解码方法();
        s.numDecodings("101");
    }
}
