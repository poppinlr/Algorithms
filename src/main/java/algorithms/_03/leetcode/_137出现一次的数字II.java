package algorithms._03.leetcode;

import java.util.List;

public class _137出现一次的数字II {

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < wordDict.size(); i++) {
            if (s.startsWith(wordDict.get(i))) {
                boolean done = wordBreak(s.substring(wordDict.get(i).length()), wordDict);
                if (done) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        _137出现一次的数字II s = new _137出现一次的数字II();
        boolean t = s.wordBreak("applepenapple", List.of("apple", "pen"));
    }

}
