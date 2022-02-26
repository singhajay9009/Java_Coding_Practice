package practice_old;

import java.sql.SQLOutput;

public class Fibonacci {
    //
    // 1 1 2 3 5 8 13......

    public static void main(String[] args) {
        System.out.println(new Fibonacci().createFibonacci(5));

        new Fibonacci().fibPrint(5);

        //

        for(int i=0; i<5; i++){
            System.out.print(fibRecursive(i) + " ");
        }
    }

    public String createFibonacci(int count){
        int n1=0, n2 = 1;
        int n3 = 0;
        String str = "1 ";
       for(int i=2; i<=count; i++){
           n3 = n1 + n2;
           str = str + n3 + " ";
           n1 = n2;
           n2 = n3;
       }
       return str;
 }

     public static int fibRecursive(int count){
        if (count <= 1) return count;
        return fibRecursive(count-1) + fibRecursive(count-2);
     }

//     public String fibString(){
//        String str = "1 ";
//        str = str + String.valueOf(fibRecursive(5));
//        return str;
//     }

    public static void fibPrint(int n){
        StringBuilder sb = new StringBuilder("1 ");
        int n1 = 0;
        int n2 = 1;
        int n3;
        for(int i=0; i<n-1; i++){
            n3 = n2 + n1;
            sb.append(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println("----");
        System.out.println(sb);
    }
}
