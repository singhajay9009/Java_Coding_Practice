package practice.leetcode.mySolution;

import java.util.*;

public class AnagramString {

    public static void main(String[] args) {
        System.out.println(new AnagramString().areAnagrams("ad3br", "rdab3"));
        System.out.println(new AnagramString().checkAnagramMethod2("aweb", "bewa"));

    }

    public boolean areAnagrams(String str1, String str2){
        if(str1 == null || str2 == null) return false;  // c
        if(str1.length() != str2.length()) return false;  // c


        // O(n log(n))
        PriorityQueue pq = new PriorityQueue();
        for(char c: str1.toCharArray()){
            pq.add(c);
        }

        // o(n log(n))
        StringBuilder sb1 = new StringBuilder();
        while(!pq.isEmpty()){
            sb1.append(pq.poll());
        }


        pq = new PriorityQueue();
        for(char c: str2.toCharArray()){
            pq.add(c);
        }
        StringBuilder sb2 = new StringBuilder();
        while(!pq.isEmpty()){
            sb2.append(pq.poll());
        }

        if(sb1.toString().equals(sb2.toString())) return true;

        return false;
    }


    public boolean checkAnagramMethod2(String str1, String str2){
        if(str1 == null || str2 == null) return false;
        if(str1.length()!= str2.length()) return false;
        char[] chars = str1.toCharArray(); // o(n)
        List<Character> list = new ArrayList<>();
        for(char c: chars){
            list.add(c);   // o(n)
        }

        for(char c : str2.toCharArray()){
            if(list.contains(c)){             //o(n)
                list.remove((Character)c);    // o(n)
            }else{
                return false;
            }
        }

        return true;
    }

}
