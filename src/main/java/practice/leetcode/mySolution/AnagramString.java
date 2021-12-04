package practice.leetcode.mySolution;

import java.util.PriorityQueue;

public class AnagramString {

    public static void main(String[] args) {
        System.out.println(new AnagramString().areAnagrams("ad3br", "rdab3"));
    }

    public boolean areAnagrams(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        PriorityQueue pq = new PriorityQueue();
        for(char c: str1.toCharArray()){
            pq.add(c);
        }

        StringBuilder sb1 = new StringBuilder();
        while(pq.peek() != null){
            sb1.append(pq.poll());
        }

        pq = new PriorityQueue();
        for(char c: str2.toCharArray()){
            pq.add(c);
        }
        StringBuilder sb2 = new StringBuilder();
        while(pq.peek() != null){
            sb2.append(pq.poll());
        }

        if(sb1.toString().equals(sb2.toString())) return true;

        return false;
    }

}
