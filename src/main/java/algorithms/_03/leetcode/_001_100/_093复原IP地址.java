package algorithms._03.leetcode._001_100;

import java.util.ArrayList;
import java.util.List;

public class _093复原IP地址 {

    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        if (s.length() > 12) {
            return new ArrayList<>();
        }
        for (int i = 1; i < Math.min(i + 4, s.length() - 2); i++) {
            String iNum = s.substring(0, i);
            if (iNum.startsWith("0") && iNum.length() > 1 || Integer.valueOf(iNum) > 255) {
                break;
            }
            for (int j = i + 1; j < Math.min(j + 4, s.length() - 1); j++) {
                String jNum = s.substring(i, j);
                if (jNum.startsWith("0") && jNum.length() > 1 || Integer.valueOf(jNum) > 255) {
                    continue;
                }
                for (int k = j + 1; k < Math.min(k + 4, s.length()); k++) {
                    String kNum = s.substring(j, k);
                    if (kNum.startsWith("0") && kNum.length() > 1 || Integer.valueOf(kNum) > 255) {
                        continue;
                    }
                    String lNum = s.substring(k);
                    if (lNum.startsWith("0") && lNum.length() > 1 || Integer.valueOf(lNum) > 255) {
                        continue;
                    }
                    list.add(String.join(".", List.of(iNum, jNum, kNum, lNum)));
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        _093复原IP地址 s = new _093复原IP地址();
        List<String> t = s.restoreIpAddresses("255255255255");
    }
}
