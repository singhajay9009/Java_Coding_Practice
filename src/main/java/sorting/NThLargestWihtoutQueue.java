package sorting;

public class NThLargestWihtoutQueue {

    public static void main(String[] args) {

        int[] arr = {1,2,23,12,3,4};  // 23,12,4,3,2,1 //nth largest -> n = 1, ans = 4

        int num = new NThLargestWihtoutQueue().getNthLargest(arr, 2);
        System.out.println(num);

    }

    // Time Complexity => O(n^2)
    public int getNthLargest(int[] arr, int n){
        if(n > arr.length) throw new IllegalArgumentException("n cannot be greater than size of array");
        int[] tempArr = new int [n];
        System.arraycopy(arr, 0, tempArr, 0, n);


        for(int i=n; i<arr.length; i++){
            int index = getSmallestElementIndex(tempArr);
            if(arr[i]> tempArr[index]){
                tempArr[index] = arr[i];
            }
        }

        int c = getSmallestElementIndex(tempArr);
        return tempArr[c];
    }

    public int getSmallestElementIndex(int[] arr){
        if(arr == null) throw new IllegalArgumentException("array object is null");
        int smallest = arr[0];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]< smallest){
                index = i;
                smallest = arr[i];
            }
        }
        return index;
    }
}
