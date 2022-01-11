package sampleTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMinFromList {

    public static void main(String[] args) throws Exception {
        int[] arr = {-5,12,5,23,34,14,45};
        int[] arr1 = {};
       // System.out.println(new FindMinFromList().getMin(arr));
        System.out.println(new FindMinFromList().getNthLowest(arr, 2));
    }

    public int getMin(int[] numArr) throws Exception {
//        if(numArr.length == 0) throw new Exception("Empty array");
//        int result = Integer.MAX_VALUE;
//        for(int num: numArr){
//            result = Integer.min(result, num);
//        }
//        return result;
        if(numArr.length == 0) throw new Exception("Empty array");
        return Arrays.stream(numArr).min().getAsInt();

    }

    public int getNthLowest(int[] numArr, int n) throws Exception {
        if(numArr.length == 0) throw new Exception("Empty array");

        List<Integer> list = Arrays.stream(numArr).boxed().collect(Collectors.toList());

        Collections.sort(list);

        return list.get(n-1);
    }
}
