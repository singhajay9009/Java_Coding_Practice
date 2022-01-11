package sampleTest;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SumOfNumsInList {

    public static void main(String[] args) {
        int sum = new SumOfNumsInList().sum(Arrays.asList(1,3,12,5));

        System.out.println(sum);

        // 1 3 12 5 -> 4
        // 12 5 4 -> 4 + 9
        //  12 9 -> 4+9+21
    }

    public int sum(List<Integer> numbers){

        PriorityQueue<Integer> pq = new PriorityQueue<>(numbers);

        int sum = 0;
        while(pq.size() > 1){
            int sumOfSmallestTwoNums = pq.poll() + pq.poll();
            sum = sum + sumOfSmallestTwoNums;
            pq.add(sumOfSmallestTwoNums);
        }

        return sum;
    }
}
