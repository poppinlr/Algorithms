package algorithms._03.leetcode;

//TODO
public class _044通配符匹配 {


    public boolean isMatch(String s, String p) {

        if (s.equals(p)) {
            return true;
        }

        if (s.length() == 0 && p.length() == 0) {
            return true;
        }

        if (s.length() == 0 && p.length() == 1 && p.equals("*")) {
            return true;
        }

        if (p.length() == 0) {
            return false;
        }

        String s1 = s.substring(0, 1);
        String p1 = p.substring(0, 1);

        if(p1.equals("?") || s1.equals(p1)){
            return isMatch(s.substring(1), p.substring(1));
        }

        if (p1.equals("*")) {
            return isMatch(s, p.substring(1))
                    || isMatch(s.substring(1), p.substring(1))
                    || isMatch(s.substring(1), p);
        }

        return false;
    }

    public static void main(String[] args) {
        _044通配符匹配 s = new _044通配符匹配();
//        boolean b1 = s.isMatch("aa", "a");
        boolean b2 = s.isMatch("aa", "*");
//        boolean b3 = s.isMatch("cb", "?a");
    }
}
