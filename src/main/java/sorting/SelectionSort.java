package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int [] arr = {-2,23,12,2, -96,96,23,2,45};

        new SelectionSort().selectionSort2(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //selection sort
    public void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }


    public void selectionSort2(int[] arr){
        int c = 0;
        while(c < arr.length-1){
            int smallest = c;
            for(int j=c+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[c];
            arr[c] = arr[smallest];
            arr[smallest] = temp;
            c++;
        }
    }
}
