package practice.leetcode.mySolution;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        String str = "MMMDCXLIX"; //3649

        System.out.println(new RomanToInt().romanToIntNum(str));
    }

    public int romanToIntNum(String roman){
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] charArr = roman.toCharArray();
        int counter = 0, sum=0;
        while(counter < roman.length()){
            sum = sum + map.get(charArr[counter]);

            if (counter!=0 && (map.get(charArr[counter]) > map.get(charArr[counter-1]))){
                sum = sum - 2*map.get(charArr[counter-1]);
            }
            counter++;
        }
        return sum;
    }
}
