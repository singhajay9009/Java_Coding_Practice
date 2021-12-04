package practice.leetcode.mySolution;

import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

    public static void main(String[] args) throws Exception {
        int [] arr = {1,12,43,4};
        int i = new KthLargestElementInArray().getKthElement(arr, 2);

        System.out.println(i);
    }

    public int getKthElement(int[] arrNum, int k) throws Exception {

        if(arrNum.length == 0) throw new Exception("Array is empty");
        if(k > arrNum.length) throw new Exception("k can't be greater than array length");

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num: arrNum){
            pq.add(num);
            if(pq.size()> k){
                pq.poll();
            }
        }

        return pq.poll();
    }
}
