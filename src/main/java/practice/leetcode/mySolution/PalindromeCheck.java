package practice.leetcode.mySolution;

public class PalindromeCheck {

    public static void main(String[] args) {

        String str = "abcbab";
        String str1 = "abcfcbab";

        // odd length -> mid = length/2 + 1 (exclude)
        // even length  -> mid = length/2  (include)
        boolean res1 = new PalindromeCheck().validatePalindrome(str);
        boolean res2 = new PalindromeCheck().validatePalindrome(str1);

        System.out.println(res1);
        System.out.println(res2);
    }

    public boolean validatePalindrome(String str){
        if(str == null || str.isEmpty()) return false;

        int length = str.length();
        boolean isLengthEven = false;
        if(length % 2 == 0) isLengthEven = true;

        if(isLengthEven){
            int mid = length/2;
//            for(int i=mid; i<length; i++){
//                if(!(str.charAt(i) == str.charAt(i-1))) return false;
//            }
            int counter = 0;
            while(mid+counter < length){
                if(!(str.charAt(mid+counter) == str.charAt(mid-(counter+1)))) return false;
                counter++;
            }

        }else{
            int mid = length/2;
//            for(int i=mid-1; i<length-1; i++){
//                if(!(str.charAt(i+1) == str.charAt(i-1))) return false;
//            }
            int counter = 1;
            while(mid+counter < length){
                if(!(str.charAt(mid+counter) == str.charAt(mid-counter))) return false;
                counter++;
            }
        }


        return true;
    }
}
