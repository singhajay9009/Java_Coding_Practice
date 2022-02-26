package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
There are N people in the vaccination queue, Chef is standing on the Pth position from the front of the queue. It takes X minutes to vaccinate a child and Y minutes to vaccinate an elderly person. Assume Chef is an elderly person.

You are given a binary array A1,A2,…,AN of length N, where Ai=1 denotes there is an elderly person standing on the ith position of the queue, Ai=0 denotes there is a child standing on the ith position of the queue. You are also given the three integers P,X,Y. Find the number of minutes after which Chef's vaccination will be completed.

Input Format
First line will contain T, number of testcases. Then the testcases follow.
The first line of each test case contains four space-separated integers N,P,X,Y.
The second line of each test case contains N space-separated integer A1,A2,…,AN.
 */
public class Vaccination {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine());

            while(tc-- > 0){
                String line2 = br.readLine();
                String[] strs = line2.trim().split("\\s+");
                int[] arr1 = new int[strs.length];
                for(int i=0; i<arr1.length; i++){
                    arr1[i] = Integer.parseInt(strs[i]);
                }

                String line3 = br.readLine();
                String[] strs1 = line3.trim().split("\\s+");
                int[] arr2 = new int[strs1.length];
                for(int i=0; i<arr2.length; i++){
                    arr2[i] = Integer.parseInt(strs1[i]);
                }

                int P = arr1[1];
                int time = 0;
                for(int i=0; i<P; i++){
                    int person = arr2[i];
                    switch(person){
                        case 0:
                            time = time + arr1[2];
                            break;
                        case 1:
                            time = time + arr1[3];
                            break;

                    }
                }
                System.out.println(time);

            }

        }catch(Exception e){
            System.exit(0);
        }
    }
}
