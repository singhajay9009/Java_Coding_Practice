package practice.leetcode.mySolution;

// Given an array which contains only binary ie. 0 & 1
// Array starts with 0
// Switch happens only once. It means once you find 1 then at all the
// following indexes would be having 1 only e.g. { 0,0,0,1,1,1,1}
// Find out the index where the switch happens
public class FindTheSwitch {
    public static void main(String[] args) {
       int [] numArr = new int[]{0,0,0};
       int index =  new FindTheSwitch().switchIndex(0, numArr.length-1, numArr);
       int index1 = new FindTheSwitch().findSwitchIndex(0, numArr.length-1, numArr);

       //  System.out.println(index);
      //  System.out.println(index1);
        System.out.println("Nannu Singh has ordered - SHANTI SE AUR AKELE KAAM KARO");
    }

    public int switchIndex(int s, int e, int[] arr){
        int m = s + (e-s)/2;
        int switchPos = 0;
        if(m!=s){
            if( arr[m] == 1 ){
                e = m;
            }else{
                s = m;
            }
            return switchIndex(s,e, arr);
        }else{
            if(arr[s] == 1) switchPos = s;
            else switchPos = e;
            return switchPos;
        }

    }


    public int findSwitchIndex(int s, int e, int[] arr){
        while(e>=s){
            int m = (s+e)/2;
            if(arr[m] == 1){
                e = m-1;
            }else{
                s = m+1;
            }
            findSwitchIndex(s, e, arr);
        }

        return arr[s]==1 ? s : -1;
    }

}
