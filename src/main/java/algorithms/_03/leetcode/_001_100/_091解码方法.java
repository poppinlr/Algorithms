package algorithms._03.leetcode._001_100;

public class _091解码方法 {
    public int numDecodings(String s) {
        if (s.startsWith("0")) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        if (s.length() == 0) {
            return 0;
        }

//        if (s.length() == 2) {
//            if (s.charAt(0) <= '2' && s.charAt(1) <= '6') {
//                return 2;
//            } else {
//                return 1;
//            }
//        }

        if (s.charAt(0) <= '2' && s.charAt(1) <= '6') {
            if(numDecodings(s.substring(1))==0||numDecodings(s.substring(2))==0){
                return 0;
            } else {
                return numDecodings(s.substring(1)) + numDecodings(s.substring(2));
            }

        } else {
            return numDecodings(s.substring(2));
        }
    }

    public static void main(String[] args) {
        _091解码方法 s = new _091解码方法();

        int t = s.numDecodings("26");
    }
}
