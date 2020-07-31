package basic.hw;

import edu.princeton.cs.algs4.StdOut;

import java.util.*;
import java.util.stream.Collectors;

public class HJ39 {

    private static int count = 0;
    private static List<List<Integer>> r = new ArrayList<>();

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            count = Integer.parseInt(scanner.nextLine());
//            String line2 = scanner.nextLine();
//
//            List<Integer> list = Arrays.stream(line2.split(" "))
//                    .map(Integer::parseInt)
//                    .collect(Collectors.toList());
//
//            Stack<Integer> stack = new Stack<>();
//            recursive(list, stack, new ArrayList<>());
//
//            StdOut.println(r);
//        }

        count = 3;
        List<Integer> list = Arrays.stream(new int[]{1, 2, 3})
                .boxed()
                .collect(Collectors.toList());
        recursive(list, new Stack<>(), new ArrayList<>());
    }

    private static void recursive(List<Integer> list, Stack<Integer> stack, ArrayList<Integer> result) {
        if (result.size() == count) {
            r.add(new ArrayList<>(result));
        }

        if(!list.isEmpty()){
            //直接出站
            int remove = list.remove(0);
            result.add(remove);
            //list-1
            recursive(list, stack, result);
            //list+1
            list.add(0, remove);
            //result 恢复
            result.remove(result.size() - 1);
        }

        
        result.add(stack.pop());
        stack.push(list.get(0));
        recursive(list, stack, result);


    }
}
