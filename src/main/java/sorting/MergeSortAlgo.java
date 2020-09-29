package sorting;

public class MergeSortAlgo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {2,10,7,5,1,3,0,11};
        mergeSort(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }

    }



    static void mergeSort(int A[]) {

        int n = A.length;
        int mid = n/2;

        if(n<2) {
            return ;
        }

        int left[] = new int[mid];
        int right[] = new int[n-mid];

        for(int i = 0 ; i < mid ; i++) {
            left[i] = A[i];
        }

        for(int i = mid ; i < n ; i++) {
            right[i-mid] = A[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,A);
    }


    // this merges the sorted left and right array into one array;
    static void merge(int left[],int right[], int arr[]){

        int l = 0;
        int r = 0;
        int k = 0;

        while(l < left.length && r < right.length) {

            if(left[l] <= right[r]) {
                arr[k] = left[l];
                l++;
            }else{
                arr[k] = right[r];
                r++;
            }

            k++;

        }//end of while
        while(l<left.length) {
            arr[k] = left[l];
            k++;
            l++;
        }
        while(r<right.length) {
            arr[k] = right[r];
            k++;
            r++;
        }
    }
}
