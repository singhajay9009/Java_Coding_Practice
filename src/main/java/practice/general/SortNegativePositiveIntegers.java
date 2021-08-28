package practice.general;

import java.util.Arrays;
import java.util.Collections;

public class SortNegativePositiveIntegers {

    public static void main(String[] args) {

    //    int[] arrayInt = new int [] {-1,-2,-3,-7,-4,-3}; // target {-1,-2,-3,-7,-4,-3}
        int[] arrayInt = new int [] {2,3,4,1,-1,-2,-4,-3,6};

     //   int i = 0;
        int j = 0;
        int i =0;

        /*
        we need to shift all positive integers towards right.
        we need to start iterating and check if num < 0.
        if yes, then shift all positive nos 1 position towards right and
        bring negative no. in left
         */
       while(i<arrayInt.length){
            if(arrayInt[i] < 0){
                int temp = arrayInt[i];
                int k = i;
                while(j < k){
                    arrayInt[k] = arrayInt[k-1];
                    k--;
                }
                arrayInt[j] = temp;
                j++;
            }
            i++;
        }
        for(int m : arrayInt){
            System.out.print(m);
        }

    }
}
