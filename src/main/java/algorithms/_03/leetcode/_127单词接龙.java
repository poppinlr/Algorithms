package algorithms._03.leetcode;

import java.util.*;

public class _127单词接龙 {

    Map<String, List<String>> graphMap = new HashMap<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList.contains(endWord)) {
            //build graphMap
            for (int i = 0; i < wordList.size(); i++) {
                String key = wordList.get(i);
                if (key.equals(beginWord)) {
                    return 1;
                }
                List<String> values = new ArrayList<>();
                for (int j = 0; j < wordList.size(); j++) {
                    String value = wordList.get(j);
                    if (i != j) {

                        if (match(key, value)) {
                            values.add(value);
                        }
                    }
                }

                graphMap.put(key, values);
            }



            String begin = null;
            for (String value : graphMap.keySet()) {
                if (this.match(beginWord, value)) {
                    begin = value;
                    break;
                }
            }

            if (begin == null) {
                return 0;
            } else {
                //markedList
                List<String> markedList = new ArrayList<>();
                //queue
                List<String> queue = new ArrayList<>();

                int count = 1;
                queue.add(begin);
                markedList.add(begin);
                while (!queue.isEmpty()) {
                    String s = queue.get(0);
                    for (int i = 0; i < queue.size(); i++) {
                        if (endWord.equals(queue.get(0))) {
                            return count;
                        }
                    }
                    queue.remove(0);
                    count++;
                    if (s.equals(endWord)) {
                        return count;
                    } else {
                        List<String> values = graphMap.get(s);
                        for (String value : values) {
                            if (!markedList.contains(value)) {
                                if (!queue.contains(value)) {
                                    queue.add(value);
                                }
                                queue.add(value);
                                markedList.add(value);
                            }
                        }
                    }
                    queue.remove(0);
                }
            }

            return 0;
        } else {
            return 0;
        }
    }

    private boolean match(String key, String value) {
        //是否能够改变一个字母到达
        int diff = 1;
        int index = 0;
        boolean match = true;
        while (index < key.length()) {
            if (value.charAt(index) == key.charAt(index)) {

            } else {
                diff--;
                if (diff < 0) {
                    match = false;
                    break;
                }
            }
            index++;
        }
        return match;
    }

    public static void main(String[] args) {
        _127单词接龙 s = new _127单词接龙();
        int i = s.ladderLength("hit", "cog",
                List.of("hot","dot","dog","lot","log","cog"));
    }
}
