package algorithms._03.leetcode._101_200;

import java.util.ArrayList;
import java.util.List;

public class _131分割回文串 {

    List<List<String>> r = new ArrayList<>();

    public List<List<String>> partition(String s) {
        if (s == null || s.length() == 0) {
            return new ArrayList<>();
        }
        //s 分割所有可能性
        recursive(s, new ArrayList<String>());
        return r;
    }

    private void recursive(String s, ArrayList<String> list) {
        if (s.length() == 0) {
            r.add(new ArrayList<>(list));
        }

        for (int i = 1; i <= s.length(); i++) {
            String str = s.substring(0, i);
            if (!isH(str)) {
                continue;
            }
            list.add(s.substring(0, i));
            recursive(s.substring(i), list);
            list.remove(list.size() - 1);
        }
    }

    private boolean isH(String str) {
        if (str.length() == 1) {
            return true;
        }

        int i = 0;
        int j = str.length()-1;
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _131分割回文串 s = new _131分割回文串();
        s.partition("aac");
    }
}
