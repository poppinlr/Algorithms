package algorithms._03.leetcode;

import java.util.*;

public class _127单词接龙 {

    Map<String, List<String>> graphMap = new HashMap<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList.contains(endWord)) {
            //build graphMap
            for (int i = 0; i < wordList.size(); i++) {
                String key = wordList.get(i);
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

            String match = null;
            int sum = 0;
            for (int i = 0; i < wordList.size(); i++) {
                if (beginWord.equals(wordList.get(i))) {
                    match = beginWord;
                    sum = 0;
                } else if (beginWord.matches(wordList.get(i))) {
                    match = wordList.get(i);
                    sum = 1;
                }
                if (match == null) {
                    continue;
                }

                List<String> l = new ArrayList<>();
                l.add(match);
                while (l.size() > 0) {
                    sum++;
                    for (String s : l) {
                        if (s.equals(endWord)) {
                            return sum;
                        } else {
                            List<String> values = graphMap.get(s);
                            for (int j = 0; j < values.size(); j++) {
                                if (!values.get(j).equals(s)) {
                                    l.add(values.get(j));
                                }
                            }
                        }
                        l.remove(s);
                    }
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
        s.ladderLength("loa", "cog",
                List.of("hot", "dot", "dog", "lot", "log", "cog"));
    }
}
