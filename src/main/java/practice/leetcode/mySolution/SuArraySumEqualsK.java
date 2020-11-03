package practice.leetcode.mySolution;

import java.util.HashMap;

class SubArraySumEqualsK{
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> sumArr = new HashMap<>();
        
        // putting this to initialize that sum as 0 is found 1 times 
        // means at any poin tif ( sum-k = 0) then this would be considered.
        sumArr.put(0, 1);
        int sum = 0;
        int result = 0;
        for(int i =0; i<nums.length; i++){
            
            sum += nums[i];
            
            if(sumArr.containsKey(sum-k)){
                result += sumArr.get(sum-k);
            }
            
            sumArr.put(sum, sumArr.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}