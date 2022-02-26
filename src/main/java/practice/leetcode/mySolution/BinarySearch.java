package practice.leetcode.mySolution;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arrNum = {-12,1,2,4,18,23,45,67,89};

        int index = findElement(arrNum, 0, arrNum.length-1, 446);

        int idx = findEle(arrNum, 446);

        System.out.println(index);
        System.out.println(idx);
    }

    public static int findElement(int[] arr, int s, int e, int ele){
        int mid = s+ (e-s)/2;

        if(e>=s){
            if(arr[mid] == ele){
                return mid;  // not considering the index, but nth element in array
            }else if(arr[mid] < ele){
                s = mid+1;
            }else{
                e = mid-1;
            }
            return findElement(arr, s, e, ele);
        }
        return -1;
    }


    public static int findEle(int[] arr, int e){

        int mid = arr.length/2;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            if(arr[mid] == e) return mid;
            else if(arr[mid] > e) end = mid-1;
            else start = mid+1;
            mid = start + (end - start)/2;
        }

        return -1;
    }
}
