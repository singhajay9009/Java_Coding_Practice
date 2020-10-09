package leetcode.mySolution;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString2 {

    public static void main(String[] args) {
        longestSubString("ab");
    }

    public static void longestSubString(String str) {
        int start=0, end=0, len=0;
        Set<Character> cSet = new HashSet<Character>();
        while( end < str.length()){
            char c = str.charAt(end);
            if(!cSet.contains(c)){
                cSet.add(c);
                len = Math.max(len, cSet.size());
                end++;
            }
            else{
                cSet.remove(str.charAt(start++));
            }
        }
        System.out.println(len);

    }

}
