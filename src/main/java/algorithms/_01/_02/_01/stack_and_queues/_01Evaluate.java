package algorithms._01._02._01.stack_and_queues;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

public class _01Evaluate {

    public static void evaluate(String args) {
        Queue<String> argQ = new Queue<>();
        for (char c : args.toCharArray()) {
            argQ.enqueue(String.valueOf(c));
        }
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        while (!argQ.isEmpty()) {
            String s = argQ.dequeue();
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                if (op.equals("+")) {
                    vals.push(vals.pop() + vals.pop());
                } else if (op.equals("*")) {
                    vals.push(vals.pop() * vals.pop());
                }
            } else {
                vals.push(Double.valueOf(s));
            }
        }
        System.out.println(vals.pop());
    }
}
