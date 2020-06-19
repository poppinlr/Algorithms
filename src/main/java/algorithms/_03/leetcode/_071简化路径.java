package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

//TODO
//栈
public class _071简化路径 {

    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        List<String> pathStack = new ArrayList<>();
        for (String p : pathArray) {
            if (p.length() > 0) {
                if ("..".equals(p)) {
                    if (pathStack.isEmpty()) {
                        continue;
                    } else {
                        pathStack.remove(pathStack.size() - 1);
                    }
                } else if (".".equals(p)) {
                    continue;
                } else {
                    pathStack.add(p);
                }
            }
        }

        if (pathStack.size() == 0) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (String p : pathStack) {
            sb.append("/");
            sb.append(p);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        _071简化路径 s = new _071简化路径();
        String t = s.simplifyPath("/a//b////c/d//././/..");

    }
}
