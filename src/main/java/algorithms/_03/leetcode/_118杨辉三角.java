package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _118杨辉三角 {

    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList<>();
        }

        if(numRows==1){
            return List.of(List.of(1));
        }

        List<List<Integer>> r = new ArrayList<>();
        List<Integer> l = List.of(1);
        while(numRows>2){
            l = g(l, r);
            numRows = numRows-1;
        }
        return r;
    }

    private List<Integer> g(List<Integer> l, List<List<Integer>> r){
        List<Integer> nl = new ArrayList<>();
        nl.add(1);
        for(int i = 1;i<l.size();i++){
            nl.add(l.get(i-1)+l.get(i));
        }
        nl.add(1);

        r.add(nl);
        return nl;
    }
}
