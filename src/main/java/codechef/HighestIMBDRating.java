package codechef;

import java.util.Scanner;

public class HighestIMBDRating {
    public static void main(String[] args) {
            // your code goes here
            try{
                Scanner sc = new Scanner(System.in);

                int countTestCases = sc.nextInt();
                while(countTestCases-- > 0){
                    int N = sc.nextInt();
                    int X = sc.nextInt();
                    int counter = N;
                    int result = 0;
                    while(counter-- <= N){
                        int movieSize = sc.nextInt();
                        int rating = sc.nextInt();
                        if(movieSize <= X){
                            result = Math.max(result, rating);
                        }
                    }
                    System.out.println(result);
                }
            }catch(Exception e){
               // System.exit(0);
            }

        }
}
