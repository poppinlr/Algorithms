package algorithms._03.leetcode;

public class _125验证回文串 {
    public boolean isPalindrome(String s) {

        char[] chars = s.trim().toLowerCase().toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i <= j) {
            if(!Character.isLetterOrDigit(chars[i])){
                if (i < chars.length-1) {
                    i++;
                }
            }

            if(!Character.isLetterOrDigit(chars[j])){
                j--;
            }

            if (Character.isLetterOrDigit(chars[i]) && Character.isLetterOrDigit(chars[j])) {
                if(chars[i] == chars[j]){
                    i++;
                    j--;
                } else {
                    return false;
                }
            }


        }
        return true;
    }
}
