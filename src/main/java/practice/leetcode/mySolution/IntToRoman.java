package practice.leetcode.mySolution;

public class IntToRoman {

    public static void main(String[] args) {
        System.out.println(new IntToRoman().intToRomanNum(3987));
    }

    public String intToRomanNum(int number){

        String [] thousands = new String[] {"", "M", "MM", "MMM"};

        String [] hundreds = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        String [] tens = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        String [] units = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[number/1000]+
                hundreds[(number%1000)/100]+
                tens[(number%100)/10]+
                units[number%10];
    }
}
