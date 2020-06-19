package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _030串联所有单词的子串 {

    private String s;
    private Map<String, Integer> map = new HashMap<>();
    private List<Integer> list = new ArrayList<>();
    private int wordL = 0;
    private int length = 0;

    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return new ArrayList<>();
        }

        this.s = s;
        int wordsL = words.length;
        wordL = words[0].length();
        length = wordsL * wordL;
        for (int i = 0; i < wordsL; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }

        int i = 0;
        while (i <= s.length() - length) {
            i = validSubStr(i, new HashMap<>(map));
        }

        return list;
    }

    private int validSubStr(int i, Map<String, Integer> map) {
        String tmpS = s.substring(i, i + length);

        while (tmpS.length() > 0) {
            String sStart = tmpS.substring(0, wordL);
            tmpS = tmpS.substring(wordL);
            if (map.containsKey(sStart) && map.get(sStart) >= 1) {
                map.put(sStart, map.get(sStart) - 1);
            } else {
                return i + 1;
            }
        }

        list.add(i);
        return i + length + 1;
    }


    public static void main(String[] args) {
        _030串联所有单词的子串 s = new _030串联所有单词的子串();
//        List<String> fullStr = s.findWordsPermutation(new String[]{"foo","bar","foo"});

        List<Integer> fullStr = s.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"});
//        List<Integer> fullStrStr = s.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
    }
}
