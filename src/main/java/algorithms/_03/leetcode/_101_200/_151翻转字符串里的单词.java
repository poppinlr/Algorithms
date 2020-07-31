package algorithms._03.leetcode._101_200;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _151翻转字符串里的单词 {

    public String reverseWords(String s) {
        List<String> list = Arrays.stream(s.split(" ")).filter(str -> !str.isBlank()).collect(Collectors.toList());
        Collections.reverse(list);
        return String.join(" ", list);
    }

    public static void main(String[] args) {
        _151翻转字符串里的单词 s = new _151翻转字符串里的单词();

        String[] strArray = "s  s s".split(" ");
        String.join(" ", strArray);
    }
}
