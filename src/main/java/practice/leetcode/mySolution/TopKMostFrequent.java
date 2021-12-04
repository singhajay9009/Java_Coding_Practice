package practice.leetcode.mySolution;

import java.util.*;
import java.util.stream.Collectors;

public class TopKMostFrequent {



    public int[] topKFrequent(int[] nums, int k) {

            Map<Integer, Integer> map = new HashMap<>();
            int[] result = new int[k];
            List<Integer> list = new ArrayList<>();

            for(int num : nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            Comparator<Map.Entry<Integer, Integer>> compValue = new Comparator<Map.Entry<Integer, Integer>>(){
                public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2){
                    return e1.getValue().compareTo(e2.getValue());
                }

            };

            // Map<Integer, Integer> map1 = map.entrySet().stream()
            //     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            //     .collect(Collectors.toMap());

            List<Map.Entry<Integer, Integer>> lst = new ArrayList<>(map.entrySet());

            Collections.sort(lst, compValue.reversed());

            for(Map.Entry<Integer, Integer> entry: lst){
                list.add((int)entry.getKey());
            }

            for(int i=0; i<list.size(); i++){
                result[i] = list.get(i);
            }
            return result;
        }


}
