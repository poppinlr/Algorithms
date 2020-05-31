package algorithms._03.leetcode.unsolved;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 单词接龙 {

    private int count = 0;
    private Map<String, List<String>> map = new HashMap<>();
    private String endWord;
    private List<String> marked = new ArrayList<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList.contains(beginWord) && wordList.contains(endWord)) {
            Map<String, List<String>> ex = new HashMap<>();
            for (String s: wordList) {
                List<String> l = new ArrayList<>();
                for (int i = 0; i < s.length(); i++) {
                    l.add(s.substring(0, i) + "*" + s.substring(i + 1));
                }
                ex.put(s, l);

            }
            this.endWord = endWord;
            if (beginWord.equals(endWord)) {
                return 1;
            } else {
                for (int i = 0; i < wordList.size(); i++) {
                    List<String> l = new ArrayList<>();
                    for (int j = 0; j < wordList.size(); j++) {
                        if (j != i) {
                            for (String s1 : ex.get(wordList.get(i))) {
                                for (String s2 : ex.get(wordList.get(j))) {
                                    if (s1.equals(s2)) {
                                        l.add(wordList.get(j));
                                    }
                                }
                            }

                        }
                    }
                    map.put(wordList.get(i), l);
                }

                int count = 1;
                List<String> qList = new ArrayList<>(map.getOrDefault(beginWord, null));
                bfs(qList);
                return count;
            }
        } else {
            return 0;
        }

    }

    private void bfs(List<String> qList) {
        if (qList.size() == 0) {
            return;
        }

        String q = qList.remove(0);
        marked.add(q);
        if (endWord.equals(q)) {
            this.count = this.count + 1;
            return;
        } else {
            for (String s : map.get(q)) {
                if (!marked.contains(s)) {
                    qList.add(s);
                }
            }
            bfs(qList);
        }
    }

    public static void main(String[] args) {
        单词接龙 s = new 单词接龙();
        int count = s.ladderLength("hit", " cog", List.of("hot","dot","dog","lot","log","cog"));
        StdOut.println(count);
    }

}
