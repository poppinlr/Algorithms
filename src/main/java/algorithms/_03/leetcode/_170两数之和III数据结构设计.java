package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

public class _170两数之和III数据结构设计 {
    Map<Integer, Integer> map;

    public _170两数之和III数据结构设计() {
        this.map = new HashMap<>();
    }

    /**
     * Add the number to an internal data structure..
     */
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    /**
     * Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        for (Integer i : map.keySet()) {
            if (map.get(i) > 0) {
                if (map.containsKey(value - i)) {
                    if (((value - i == i) && map.get(i) > 1)||((value - i != i)&&(map.get(value - i) > 0))) {
                        if (map.get(value - i) > 0) return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        _170两数之和III数据结构设计 s = new _170两数之和III数据结构设计();

        s.add(3);
        s.add(2);
        s.add(1);
        StdOut.println(s.find(6));
    }
}
