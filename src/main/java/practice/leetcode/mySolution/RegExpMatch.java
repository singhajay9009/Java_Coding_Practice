package practice.leetcode.mySolution;

public class RegExpMatch {

    public static void main(String[] args) {
        System.out.println(new RegExpMatch().isMatch("adc", "abc*"));
    }

   /* public boolean isMatch(String s, String p) {

        boolean [][] dp = new boolean [s.length()+1][p.length()+1];

        char [] txt = s.toCharArray();
        char [] ptrn = p.toCharArray();

        dp[0][0] = true;

        for(int j =1 ; j<p.length(); j++){
            if(ptrn[j] == '*' && dp[0][j-2]){
                dp[0][j] = true;
            }
        }

        for( int i=1; i<s.length() ; i++){

            for( int j =1; j<s.length(); j++){
                if(txt[i] == ptrn[j] || ptrn[j] == '.'){
                    dp[i][j] = dp[i-1][j-1];
                }else if(ptrn[j] == '*'){
                    dp[i][j] = dp[i][j-2];
                    if(ptrn[j-1] == txt[i] || ptrn[j-1] == '.'){
                        dp[i][j] = dp[i][j] | dp[i-1][j];
                    }
                }else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[s.length()][p.length()];
    }*/

    public boolean isMatch(String s, String p) {

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;

        char[] string = new char[s.length()+1];
        char[] pattern = new char[p.length()+1];

        string[0] = (char)0;
        pattern[0] = (char)0;

        for(int i=0;i<s.length();i++){
            string[i+1] = s.charAt(i);
        }

        for(int i=0;i<p.length();i++){
            pattern[i+1] = p.charAt(i);
        }

        for(int i=1;i<pattern.length;i++){
            if(pattern[i]=='*' && dp[0][i-2]){
                dp[0][i] = true;
            }
        }

        for(int i=1;i<string.length;i++){
            for(int j=1;j<pattern.length;j++){
                if(pattern[j]==string[i] || pattern[j]=='.'){
                    dp[i][j] = dp[i-1][j-1];
                }else if(pattern[j]=='*'){
                    dp[i][j] = dp[i][j-2];
                    if(pattern[j-1]==string[i] || pattern[j-1]=='.'){
                    //    dp[i][j] = dp[i][j-2] || dp[i-1][j];
                        dp[i][j] = dp[i][j] | dp[i-1][j];
                    }
                  /*else{
                        dp[i][j] = dp[i][j-2];
                    }*/
                }
            }
        }

        return dp[s.length()][p.length()];

    }
}
