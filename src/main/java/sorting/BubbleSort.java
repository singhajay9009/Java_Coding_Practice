package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,-5,33,12,45,-20,67,11};
        new BubbleSort().bubbleSort(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    return arr;
    }


    public int[] bubbleSort2(int[] arr){
        int n = 0;
        while(n < arr.length){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        n++;
        }
        return arr;
    }
}
