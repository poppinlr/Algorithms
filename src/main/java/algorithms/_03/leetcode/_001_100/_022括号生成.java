package algorithms._03.leetcode._001_100;

import java.util.ArrayList;
import java.util.List;

public class _022括号生成 {

    private int N;
    List<String> l = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        this.N = n;
        StringBuilder sb = new StringBuilder();
        recursive(0, 0, sb);
        return l;
    }

    private void recursive(int leftCount, int rightCount, StringBuilder sb) {
        if (leftCount == N && rightCount == N) {
            l.add(sb.toString());
            return;
        }

        if (leftCount <= N) {
            sb.append("(");
            recursive(leftCount + 1, rightCount, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (leftCount > rightCount) {
            sb.append(")");
            recursive(leftCount, rightCount + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        _022括号生成 s = new _022括号生成();
        s.generateParenthesis(3);
    }
}
