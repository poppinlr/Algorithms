package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

public class _119杨辉三角形II {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        for (int i = 2; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                l.set(j, l.get(j) + l.get(j - 1));
            }
            l.add(1);
            StdOut.println(l);
        }

        return l;
//
//        int[] l = new int[rowIndex];
//        l[0] = 1;
//        l[1] = 1;
//
//        for (int i = 3; i <= rowIndex; i++) {
//            for (int j = i - 2; j > 0; j--) {
//                l[j] = l[j] + l[j - 1];
//            }
//            l[i - 1] = 1;
//            StdOut.println(l);
//        }
//
//        return l;
    }

    public static void main(String[] args) {
        _119杨辉三角形II s = new _119杨辉三角形II();
        s.getRow(2);
    }
}
