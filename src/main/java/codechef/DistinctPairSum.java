package codechef;

import java.util.Scanner;

public class DistinctPairSum {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{

            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                int L = sc.nextInt();
                int R = sc.nextInt();
                if( R-L == 0) System.out.println(1);
                else{
                    int res = nCr(R-L+1, 2) + (R-L+1);
                    System.out.println(res);
                }
            }
        }catch(Exception e){
            System.exit(0);
        }
    }

    public static int nCr(int n, int r){
        return fact(n)/(fact(n-r) * fact(r));
    }

    public static int fact(int x){
        if (x == 0) return 1;
        else return x * fact(x-1);
    }
}
