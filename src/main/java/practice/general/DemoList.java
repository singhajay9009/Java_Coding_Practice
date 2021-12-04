package practice.general;

import java.util.Arrays;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {

        Integer[] intArr = new Integer[3];
        intArr[0] = 2;
        intArr[1] = 4;
        intArr[2] = 56;

        List<Integer> lstInteger = Arrays.asList(intArr);

        intArr = (Integer[]) lstInteger.toArray();


    }
}
