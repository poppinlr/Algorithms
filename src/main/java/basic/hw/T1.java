package basic.hw;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {

        String[] lines = "The furthest distance in the world, Is not between life and death, But when I stand in front of you, Yet you don't know that I love you".split("[^Aa-zA-Z]");
        System.out.println(lines);
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            String line = in.nextLine();
//            String word = in.nextLine();
//
//            List<String> result = new ArrayList<>();
//            String[] lines = line.split("[^Aa-zA-Z]");
//            for (String l: lines) {
//                if (l.startsWith(word)) {
//                    result.add(l);
//                }
//            }
//            if (result.size() == 0) {
//                System.out.println(word);
//            } else {
//                System.out.println(String.join(" ", result));
//            }
//
//        }
    }
}