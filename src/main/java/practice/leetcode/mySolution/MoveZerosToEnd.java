package practice.leetcode.mySolution;

public class MoveZerosToEnd {

    public static void main(String[] args) {
       //  int [] arr = new int[]{0,1,3,0,2};
         int [] arr = new int[] {1,1,1,1};
         int i=0, j = 0;
         while(j<arr.length){
             if(arr[j] != 0){
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
               i++;
             }
             j++;
         }
        for(int k: arr){
            System.out.println(k);
        }
    }
}
 