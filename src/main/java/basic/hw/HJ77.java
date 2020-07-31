package basic.hw;

import java.util.*;
import java.util.stream.Collectors;

public class HJ77 {

    private static List<List<String>> r = new ArrayList<>();
    private static int count = 0;
    private static List<String> trains;

    private static Stack<String> in = new Stack<>();
    private static List<String> out = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            //1 2 3

            count = Integer.parseInt(scanner.nextLine());
            trains = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());



            StringBuilder sb = new StringBuilder();
            for (List<String> l : r) {
                sb.append(String.join(" ", l) + "\n");
            }
            System.out.println(sb);
        }

    }

    private static void recursive(List<String> out, List<String> in, List<String> list) {

    }
}
