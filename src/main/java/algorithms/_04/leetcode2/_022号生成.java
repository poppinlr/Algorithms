package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _022号生成 {
    private int n = 0;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        List<String> r = new ArrayList<>();
        recursive(new StringBuilder(), 0, 0, r);
        return r;
    }

    private void recursive(StringBuilder sb, int left, int right, List<String> r) {
        if (left == right && sb.length() == n * 2) {
            r.add(sb.toString());
        }

        //append left
        if (left < n) {
            sb.append("(");
            recursive(sb, left + 1, right, r);
            sb.deleteCharAt(sb.length() - 1);
        }
        //append right

        if (right < left) {
            sb.append(")");
            recursive(sb, left, right + 1, r);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
