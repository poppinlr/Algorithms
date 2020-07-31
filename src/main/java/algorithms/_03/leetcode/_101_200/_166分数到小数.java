package algorithms._03.leetcode._101_200;

public class _166分数到小数 {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }

        boolean symbol = numerator * denominator > 0;

        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        StringBuilder sb = new StringBuilder();
        if (numerator > denominator) {
            sb.append(numerator / denominator);
        }

        numerator = numerator % denominator;
        if (numerator > 0) {
            sb.append("0.");
        }

        while (numerator > 0) {
            int c = numerator * 10 / denominator;
            int y = numerator * 10 % denominator;
            if (y == numerator) {
                sb.append("(");
                sb.append(c);
                sb.append(")");
                if (symbol) {
                    return sb.toString();
                } else {
                    return "-" + sb;
                }
            } else {
                sb.append(c);
                numerator = y;
            }
        }
        if (symbol) {
            return sb.toString();
        } else {
            return "-" + sb;
        }
    }

    public static void main(String[] args) {
        _166分数到小数 s = new _166分数到小数();
        s.fractionToDecimal(2, 3);
    }
}
