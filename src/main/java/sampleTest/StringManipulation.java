package sampleTest;

import java.util.Stack;

public class StringManipulation {
    public static void main(String[] args) {
        System.out.println(new StringManipulation().getString("ADCCDBAA"));

    }

    public String getString(String S){

        if (S == null || S.isEmpty()) return S;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<S.length(); i++){
            if(stack.empty()) {
                stack.push(S.charAt(i));
                continue;
            }

            switch(S.charAt(i)){
                case 'A':
                    if(stack.peek() == 'B')stack.pop();
                    else stack.push(S.charAt(i));
                    break;
                case 'B':
                    if(stack.peek() == 'A')stack.pop();
                    else stack.push('B');  // to make it more performant use 'B' directly, else need to find the char at ith index in String
                    break;
                case 'C':
                    if(stack.peek() == 'D')stack.pop();
                    else stack.push('C');
                    break;
                case 'D':
                    if(stack.peek() == 'C')stack.pop();
                    else stack.push('D');
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();


    }


}
