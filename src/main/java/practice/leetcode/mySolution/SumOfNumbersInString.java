package practice.leetcode.mySolution;

public class SumOfNumbersInString {

    public static void main(String[] args) {

        System.out.println(new SumOfNumbersInString().sumNumbers("12dsfs54wer3ty"));

    }

    public int sumNumbers(String str) {

        int i=0, n=str.length(), flag=1, startIndex=0, sum=0;
        String str1 = null;

        while(i<n){
            while(Character.isDigit(str.charAt(i))){
                if(flag == 1){
                    startIndex = i;
                }
                flag = 0;
                str1 = str.substring(startIndex, i+1);
                i++;
                if(i==n){
                    i--;
                    break;
                }
            }
            if( flag ==0){
                sum = sum + Integer.parseInt(str1);
            }

            flag = 1;
            i++;

        }

        return sum;
    }
}
