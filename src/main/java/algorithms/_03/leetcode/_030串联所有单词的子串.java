package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _030串联所有单词的子串 {

    private int length = 0;

    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null || words.length == 0 || s.length() == 0) {
            return new ArrayList<>();
        }
        this.length = words[0].length();
        int totalLength = length * words.length;

        //words 全排列
        List<String> wordList = findWordsPermutation(words);

        List<Integer> find = new ArrayList<>();
        //loop s
        for (int i = 0; i <= s.length() - totalLength; i++) {
            for (String value : wordList) {
                if (s.substring(i).startsWith(value)) {
                    find.add(i);
                    break;
                }
            }
        }

        return find;
    }

    public List<String> findWordsPermutation(String[] words) {
        List<String> list = new ArrayList<>();
        recursive(words, list, new ArrayList<>(), new StringBuilder());
        return list;
    }

    public void recursive(String[] words, List<String> list, List<Integer> indexList, StringBuilder sb) {

        if (indexList.size() == words.length) {
            if (!list.contains(sb.toString())) {
                list.add(sb.toString());
            }
            return;
        }

        //loop
        for (int j = 0; j < words.length; j++) {
            //try
            if (indexList.contains(j)) {
                continue;
            } else {
                //try
                sb.append(words[j]);
                indexList.add(j);
                //loop
                recursive(words, list, indexList, sb);
                //backtrack
                indexList.remove(indexList.size() - 1);
                sb.delete(sb.length() - length, sb.length());
            }
        }
    }

    public static void main(String[] args) {
        _030串联所有单词的子串 s = new _030串联所有单词的子串();
//        List<String> fullStr = s.findWordsPermutation(new String[]{"foo","bar","foo"});

        s.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"});
    }
}
