
public class InsertionSort
{
	public static void main(String[] args) {
	    int [] arr = {1,3,2,6,8,12,4};
	    new InsertionSort().sort(arr);
	    
	}
	void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
        
        for(int k =0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
        
    }
}
