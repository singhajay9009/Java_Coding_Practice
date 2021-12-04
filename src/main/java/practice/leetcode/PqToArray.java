package practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PqToArray {



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));

        PriorityQueue<Integer> pq = new PriorityQueue<>(list);

        int[] result = new int [list.size()];
        System.out.println("size" + pq.size());
        for (int i=0; i<pq.size(); i++){

            result[i] = pq.poll();
        }

        pq.stream().forEach(System.out::print);
    }
}
