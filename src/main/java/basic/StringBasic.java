package basic;

import edu.princeton.cs.algs4.StdOut;

import java.util.Hashtable;
import java.util.TreeMap;

public class StringBasic {

    public static void main(String[] args) {
//        String s1 = "通话";
//        String s2 = "重地";
//
//        StdOut.println(s1.hashCode());
//        StdOut.println(s2.hashCode());
//        StdOut.println(s1.equals(s2));
//
//        Hashtable hashtable = new Hashtable();

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2, 2);
        treeMap.put(1, 1);

        for (int k : treeMap.keySet()) {
            StdOut.println(treeMap.get(k));
        }
    }
}
