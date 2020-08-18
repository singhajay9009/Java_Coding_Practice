package practice.leetcode.original;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {

        System.out.println(longestString());


    }

    public static String longestString(){

        String str = "abbcdrtyucaart";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int n, ans = 0;
        String str2 = "";
        n = str.length();
        for(int i=0, j=0; j<n; j++){
            if(map.containsKey(str.charAt(j))){
                i = Math.max(map.get(str.charAt(j)), i);
            }
            ans = Math.max(ans, j-i+1);
            map.put(str.charAt(j), j+1);
            str2 = str.substring(i,j+1).length()> str2.length() ? str.substring(i,j) : str2;
        }
        return str2 + "-" + ans;
    }

}
