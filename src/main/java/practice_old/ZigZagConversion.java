package leetcode.mySolution;

import java.util.HashMap;
import java.util.Map;

public class ZigZagConversion {
    public String zigZag (String s, int rowNum){
        int y = 0;
        boolean incr = true;
        Map<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();

        for(char c: s.toCharArray()){
            if(y == rowNum) incr = false;
            if(y == 1) incr = true;
            if(incr) y++; else y--;
            if(!map.containsKey(y)) map.put(y, new StringBuilder());
            map.get(y).append(c);
        }
        StringBuilder str = new StringBuilder();
        for(int i: map.keySet()){
            str.append(map.get(i));
        }
       return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ZigZagConversion().zigZag("PAYPALISHIRING", 4));
    }
}
