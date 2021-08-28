package practice.leetcode.mySolution;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arrNum = {1,2,4,18,23,45,67,89};

        int index = findElement(arrNum, 0, arrNum.length-1, 89);

        System.out.println(index);
    }

    public static int findElement(int[] arr, int s, int e, int ele){
        int mid = (s+e)/2;

        if(e>=s){
            if(arr[mid] == ele){
                return mid+1;
            }else if(arr[mid] < ele){
                s = mid+1;
            }else{
                e = mid-1;
            }
            return findElement(arr, s, e, ele);
        }
        return -1;
    }
}
