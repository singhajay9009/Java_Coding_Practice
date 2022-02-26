package sampleTest;

public class StringPattern {

    public static void main(String[] args) {
        String str = new StringPattern().solution("ABC");
        System.out.println(str);
    }

    public String solution(String S) {
        // write your code in Java SE 8

        if (S == null || S.isEmpty()) return S;
        char[] letters = S.toCharArray();
        char previous = 'Z';
        StringBuilder sb = new StringBuilder(S);
        int num = 0;
        for(int i=0; i<letters.length; i++){

            switch(letters[i]){
                case 'A':
                    if(previous == 'B'){
                        sb.replace(i-num-1, i-num+1, "");
                        if(i-num-2 <0) {
                            previous = 'X';
                        }else{
                            previous = letters[i-num-2];
                        }
                        num = num +2;
                    }else{
                        previous = letters[i];
                    }
                    break;
                case 'B':
                    if(previous == 'A'){
                        sb.replace(i-num-1, i-num+1, "");

                        if(i-num-2 <0) {
                           previous = 'X';
                        }else{
                            previous = letters[i-num-2];
                        }
                        num = num +2;
                    }else{
                        previous = letters[i];
                    }
                    break;
                case 'C':
                    if(previous == 'D'){
                        sb.replace(i-num-1, i-num+1, "");

                        if(i-num-2 <0) {
                            previous = 'X';
                        }else{
                            previous = letters[i-num-2];
                        }
                        num = num +2;
                    }else{
                        previous = letters[i];
                    }
                    break;
                case 'D':
                    if(previous == 'C'){
                        sb.replace(i-num-1, i-num+1, "");

                        if(i-num-2 <0) {
                            previous = 'X';
                        }else{
                            previous = letters[i-num-2];
                        }
                        num = num +2;
                    }else{
                        previous = letters[i];
                    }
                    break;

            }

        }

        return sb.toString();


    }
}
