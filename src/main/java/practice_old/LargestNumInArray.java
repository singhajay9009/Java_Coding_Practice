package practice_old;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumInArray {

    public static void main(String[] args) {

        int[] arrNum = {-2,-23,-4,-8};
       // int[] arrNum = {};
        try{
            System.out.println(getMax(arrNum));
        }
        catch(Exception e){
            System.out.println(e);
        }


    }

    // write a method to return the largest number in the array passed as param

    static int getMax(int[] arr) throws Exception {

        int max =  Arrays.stream(arr).max().orElseThrow(() -> new Exception("Can't be null"));

        //using parallel streams
        int max2 = Arrays.stream(arr).parallel().max().orElseThrow(NullPointerException::new);

        return max;
    }


    static int getMaximum(List<Integer> list) throws Exception {

        return list.stream().max(Integer::compare).orElseThrow(
                ()-> new Exception("list can not be null"));
    }

    public int getMaxNum(int[] arr) throws Exception {
        if(arr == null || arr.length == 0) throw new Exception("Array can't be null or empty");
        int max = arr[0];
        for(int num: arr){
            max = Math.max(max, num);
        }
        return max;
    }
}
