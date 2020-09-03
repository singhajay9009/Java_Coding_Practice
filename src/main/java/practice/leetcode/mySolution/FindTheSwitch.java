package practice.leetcode.mySolution;

// Given an array which contains only binary ie. 0 & 1
// Array starts with 0
// Switch happens only once. It means once you find 1 then at all the
// following indexes would be having 1 only e.g. { 0,0,0,1,1,1,1}
// Find out the index where the switch happens
public class FindTheSwitch {
    public static void main(String[] args) {
       int [] numArr = new int[]{0,0,1,1,1,1};
       int index =  new FindTheSwitch().switchIndex(0, numArr.length-1, numArr);
       System.out.println(index);
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

}
