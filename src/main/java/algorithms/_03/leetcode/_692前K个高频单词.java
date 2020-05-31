package algorithms._03.leetcode;

import java.util.*;

public class _692前K个高频单词 {

    public List<String> topKFrequent(String[] words, int k) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String str: words) {
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 0);
            }
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (map.get(s1) > map.get(s2)) {
                    return -1;
                } else if (map.get(s1) .equals( map.get(s2))) {
                    return s1.compareTo(s2);
                } else {
                    return 1;
                }
            }
        });

        priorityQueue.addAll(map.keySet());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(priorityQueue.poll());
        }
        return list;
    }
}
