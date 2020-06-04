package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _089格雷编码 {

    public List<Integer> grayCode(int n) {
        if (n == 0) {
            return List.of(0);
        }
        if (n == 1) {
            return List.of(0,1);
        }

        int i = 1;
        List<Integer> r = List.of(0, 1);
        while (i < n) {
            r = getR(r);
            i++;
        }

        return r;
    }

    private List<Integer> getR(List<Integer> r) {
        List<Integer> newR = new ArrayList<>();
        for (int i = 0; i < r.size(); i++) {
            int j = r.get(i);
            newR.add(j << 1);
            newR.add((j << 1) + 1);
        }

        return newR;
    }

    public static void main(String[] args) {
        _089格雷编码 s = new _089格雷编码();
        s.grayCode(2);
    }
}
