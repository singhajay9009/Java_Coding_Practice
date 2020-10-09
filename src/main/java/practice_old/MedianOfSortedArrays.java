package leetcode.mySolution;

public class MedianOfSortedArrays {

    public double medianOfArrays(int[] array1, int[] array2){
        int lenArr1 = array1.length;
        int lenArr2 = array2.length;
        int midX=0, midY = 0;
        int median = 0;

        if(lenArr1 > lenArr2){
            medianOfArrays(array2, array1);
        }else{
           midX = lenArr1%2 ==0 ? lenArr1/2 : (lenArr1+1)/2 ;
           midY = lenArr2%2 ==0 ? lenArr2/2 : (lenArr2+1)/2 ;
        }
        while(true){

            if(Integer.max(array1[midX], array2[midY]) <= Integer.min(array1[midX+1], array2[midY+1])){
               median =  Integer.max(array1[midX], array2[midY]);
            }
            else{
                if(array1[midX] > array2[midY]){

                }
            }
        }
    }
}
