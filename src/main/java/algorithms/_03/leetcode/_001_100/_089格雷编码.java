package algorithms._03.leetcode._001_100;

import java.util.ArrayList;
import java.util.List;

public class _089格雷编码 {

    public List<Integer> grayCode(int n) {
        List<Integer> r = new ArrayList<>();
        r.add(0);
        int head = 1;
        for (int i = 1; i < n; i++) {
            for (int j = r.size() - 1; j >= 0; j--) {
                r.add(head + r.get(j));
            }
            head = head << 1;
        }

        return r;
    }


    public static void main(String[] args) {
        _089格雷编码 s = new _089格雷编码();
        s.grayCode(3);
    }
}
