package algorithms._03.leetcode;

public class _680验证回文字符串II {
    public boolean validPalindrome(String s) {
        boolean valid = true;
        int ignore = 0;
        int i = 0;
        int j = s.length()-1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (validSub(s.substring(i+1,j+1)) || validSub(s.substring(i,j))) {
                    break;
                } else {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    private boolean validSub(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _680验证回文字符串II s = new _680验证回文字符串II();
        s.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga");
    }
}
