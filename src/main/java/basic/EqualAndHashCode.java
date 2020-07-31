package basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EqualAndHashCode {

    /**
     * p1 hashCode: 1313922862
     * p2 hashCode: 2094548358
     * p1.equals(p2): false
     * p1==p2: false
     * k: basic.Person@4e50df2e , v : 1
     * k: basic.Person@7cd84586 , v : 2
     * <p>
     * p1 hashCode: 1313922862
     * p2 hashCode: 2094548358
     * p1.equals(p2): true
     * p1==p2: false
     * k: basic.Person@4e50df2e , v : 1
     * k: basic.Person@7cd84586 , v : 2
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        while (scan.hasNext()) {
            set.add(Integer.valueOf(scan.next()));
        }

        StringBuilder sb = new StringBuilder();
        for (int i : set) {
            sb.append(i + "\n");
        }

        System.out.println(sb.toString());
    }
}
