package practice.leetcode.mySolution;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

    public static void main(String[] args) throws Exception {
        int [] arr = {1,12,43,4};
        int i = new KthLargestElementInArray().getKthElement(arr, 2);

        System.out.println(i);

        int[] arr1 = {2,4,12,34,11};
        System.out.println(new KthLargestElementInArray().secondLargest(arr1));
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

    public int secondLargest(int[] arr){
        if(arr == null || arr.length < 2) return -1000000000;
        int[] numbers = new int[2];
        numbers[0] = Math.min(arr[0], arr[1]);
        numbers[1] = Math.max(arr[0], arr[1]);

        for(int num: arr){
            updateNumbers(num, numbers);
        }
        return numbers[0];
    }

    private void updateNumbers(int num, int[] numbers){
        if(num > numbers[0]) {
            numbers[0] = Math.min(num, numbers[1]);
            numbers[1] = Math.max(num, numbers[1]);
        }
    }
}
