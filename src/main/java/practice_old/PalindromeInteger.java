package leetcode.mySolution;
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.


public class PalindromeInteger {

    public static void main(String[] args) {
        System.out.println(new PalindromeInteger().palindrome(1231));
    }

    public boolean palindrome(int x){

        int revNum = 0;
        int y = x;
        while(x!=0){
            revNum = revNum * 10 + x % 10;
            x = x/10;
        }
        return revNum==y ;
    }

    //////// This is String solution /////////////////////
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while ( start < end ) {
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
}
