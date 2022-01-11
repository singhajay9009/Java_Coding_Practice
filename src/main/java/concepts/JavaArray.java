package concepts;

import java.util.Arrays;
import java.util.Collections;

public class JavaArray {

    public static void main(String[] args) {

        int[] numbers = new int[3];  // fixed size

        numbers[1] = 12;

        int numbersTemp[] = new int[6];
        for(int i=0; i<numbers.length; i++){
            numbersTemp[i] = numbers[i];
        }

        numbers = numbersTemp;

        numbers[3] = 34;
        numbers[4] = 12;
        numbers[5] = 56;

        for(int num: numbers){
            System.out.println(num);
        }

        System.out.println("===============");

        char[] chars = new char[2];
        byte[] bytes = new byte[2];
        double[] nums = new double[2];
        // 0 1 2
        System.out.println(numbers[2]);
        System.out.println(chars[1]);
        System.out.println(nums[1]);

        int[] numbers1 = {1,2,3,4};
        int[] numbers2 = new int[]{1,20};

        System.out.println(numbers2[1]);

    }
}
