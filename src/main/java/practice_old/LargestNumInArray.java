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

        return Arrays.stream(arr).max().orElseThrow(() -> new Exception("Can't be null"));
    }


    static int getMaximum(List<Integer> list) throws Exception {

        return list.stream().max(Integer::compare).orElseThrow(
                ()-> new Exception("list can not be null"));
    }
}
