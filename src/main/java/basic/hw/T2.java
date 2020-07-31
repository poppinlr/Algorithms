package basic.hw;

import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String line = scanner.nextLine();
            int count = Integer.parseInt(line.split(" ")[0]);
            int step = Integer.parseInt(line.split(" ")[1]);
            Set<Integer> set = new HashSet<>();
            while (count > 0) {
                String[] c = scanner.nextLine().split(" ");
                //过滤时间相同的菜
                set.add(Integer.parseInt(c[0]) + Integer.parseInt(c[1]));
                count--;
            }

            List<Integer> list = new ArrayList<>(set);
            list.sort(Integer::compareTo);
            int eat = 0;
            int eatTime = 0;
            for (int i = 0; i < list.size(); i++) {
                //第一个菜小于手速, 则吃不到
                if (i == 0) {
                    if (list.get(0) < step) {
                        continue;
                    } else {
                        eat++;
                        eatTime = list.get(i);
                    }
                //距离上个吃到的菜, 小于手速则吃不到
                } else {
                    if (list.get(i) - eatTime < step) {
                        continue;
                    } else {
                        eat++;
                        eatTime = list.get(i) + eatTime;
                    }
                }
            }
            System.out.println(eat);
        }
    }
}
