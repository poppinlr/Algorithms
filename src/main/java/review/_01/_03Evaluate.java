package review._01;


import edu.princeton.cs.algs4.Stack;

public class _03Evaluate {

    private Stack<Double> vals = new Stack<>();
    private Stack<String> opts = new Stack<>();

    public double evaluate(String a) {
        for (int i = 0; i < a.length(); i++) {
            String as = String.valueOf(a.charAt(i));
            if (as.equals("(")) continue;
            else if (as.equals("+")) opts.push("+");
            else if (as.equals("*")) opts.push("-");
            else if (as.equals(")")) {
                String opt = opts.pop();
                if (opt.equals("+")) {
                    vals.push(vals.pop() + vals.pop());
                } else {
                    vals.push(vals.pop() * vals.pop());
                }
            } else {
                vals.push(Double.valueOf(as));
            }
        }
        return vals.pop();
    }
}
