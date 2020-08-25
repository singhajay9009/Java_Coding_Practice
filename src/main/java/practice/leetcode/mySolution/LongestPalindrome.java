package practice.leetcode.mySolution;

public class LongestPalindrome {

    static int resultStart;
    static int resultLength;

    public static void main(String[] args) {

        //

        String str = "abcecbbcecaf";
        int begin = 0;
        int end = 0;
        int start =0;

        if(str.length() < 2){
            System.out.println(str);
        }else {

            for (int i = 0; i < str.length(); i++) {
                findLongestPalindrome(str, i, i);
                findLongestPalindrome(str, i, i + 1);
            }
            String subString = str.substring(resultStart, resultStart + resultLength);
            System.out.println(subString);
        }
    }

    private static void findLongestPalindrome(String str, int l, int r){
        while ( l >=0 && r < str.length() && str.charAt(l)==str.charAt(r)){

            r++;
            l--;
        }

        if(resultLength < r-l-1){
            resultStart = l + 1;
            resultLength = r - l - 1;
        }
    }
}
