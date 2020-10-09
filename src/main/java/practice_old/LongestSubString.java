package leetcode.mySolution;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    static String longestString = "";
    public static void main(String[] args) {
        System.out.println(longestString("abecrtyac"));

    }

    public static String longestString(String s){
        if(s.length() < 2){
            return s;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        String str = "";
        for (int i= start; i<s.length(); i++){

            if(map.containsKey(s.charAt(i))){

                if( start <= map.get(s.charAt(i))){
                    start = map.get(s.charAt(i)) + 1;
                }
            }
            map.put(s.charAt(i), i);
            str = s.substring(start, i+1);
            if(longestString.length() < str.length()){
                longestString = str;
            }

        }
        return longestString;
    }


}
