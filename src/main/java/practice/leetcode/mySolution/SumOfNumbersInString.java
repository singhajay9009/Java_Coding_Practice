package practice.leetcode.mySolution;

public class SumOfNumbersInString {

    public static void main(String[] args) {

    //    System.out.println(new SumOfNumbersInString().sumNumbers("12dsfs54wer3ty"));

     //   System.out.println(new SumOfNumbersInString().sumNumbersSolution2("12dss54w3"));

        System.out.println(new SumOfNumbersInString().sumNumbersSolution3("23c4d5e3"));

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

    //

    public int sumNumbersSolution2(String str) {

        int i=0, n=str.length(), flag=1, startIndex=0, sum=0;
        String str1 = "0";

        while(i<n) {
            if (Character.isDigit(str.charAt(i))) {
                flag = 0;
                str1 = str.substring(startIndex, i+1);
            }
            else{
                startIndex = i+1;
            }
            if(flag == 0 && (!Character.isDigit(str.charAt(i)) || i==n-1)){
                sum = sum + Integer.parseInt(str1);
                flag =1;
            }
            i++;
        }
        return sum;
    }


    // Seems this is the cleanest and shortest solution
    public int sumNumbersSolution3(String str) {

        int i=0, n=str.length(), flag=1, sum=0;
        String str1 = "";

        while(i<n) {
            if (Character.isDigit(str.charAt(i))) {
                flag = 0;
                str1 = str1 + str.charAt(i);
            }
            if(flag == 0 && (!Character.isDigit(str.charAt(i)) || i == n-1)){
                sum = sum + Integer.parseInt(str1);
                str1 = "";
                flag = 1;
            }
            i++;
        }
        return sum;
    }
}
