package practice_old;

import java.util.HashMap;

import java.util.Map;


public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1,24,3,6,45,42,87};
        int target = 88;
        twoSum(arr, target);
    }

    public static void twoSum(int[] arr, int target) {
        int flag =0;
       Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for ( int i =0; i<arr.length; i++){
            if(target - arr[i]!= arr[i]){
                if(numMap.containsKey(target-arr[i])){
                    System.out.println("Indexes of numbers are: " + numMap.get(target-arr[i]) + "," + i );
                    flag=1;
                    break;
                }
                else{
                    numMap.put(arr[i], i);
                }
            }
        }
        if(flag==0){
            System.out.println("No solution found!");
        }
    }
}
