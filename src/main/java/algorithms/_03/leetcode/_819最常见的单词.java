package algorithms._03.leetcode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _819最常见的单词 {

    public String mostCommonWord(String paragraph, String[] banned) {
        char[] pChar = paragraph.toLowerCase().toCharArray();
        for (int i = 0; i < pChar.length; i++) {
            if (!Character.isLetter(pChar[i])) {
                pChar[i] = ' ';
            }
        }
        Map<String, Integer> map = Stream.of(String.valueOf(pChar).split(" "))
                .collect(Collectors.groupingBy(s -> s))
                .entrySet()
                .stream()
                .filter(e -> !List.of(banned).contains(e.getKey()) && !e.getKey().isEmpty())
                .collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().size()));
        int count = 0;
        String s = null;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() >= count) {
                count = e.getValue();
                s = e.getKey();
            }
        }

        return s;
    }

    public static void main(String[] args) {
        _819最常见的单词 s = new _819最常见的单词();
        s.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
    }
}
