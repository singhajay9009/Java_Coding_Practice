package sampleTest;

import java.util.Stack;

public class WordSmaple {
    public static void main(String[] args) {
        int i = new WordSmaple().solution("123 DUP +");
        System.out.println(i);
    }


    public int solution(String S) {
        // write your code in Java SE 8
        if( S == null || S.isEmpty()) return -1;
        //convert to array of String
        String[] elements = S.split(" ");
        Stack<Integer> stack = new Stack<> ();

        for(String str: elements){
            if(isInteger(str))stack.push(Integer.valueOf(str));

            switch(str){
                case "POP":
                    if(stack.empty()) return -1;
                    stack.pop();
                    break;
                case "DUP":
                    if(stack.empty()) return -1;
                    stack.push(stack.peek());
                    break;
                case "+":
                    if(stack.empty()) return -1;
                    int top = stack.pop();
                    if(stack.empty()) return -1;
                    int sum = top + stack.pop();
                    if(sum < 0 || sum > Math.pow(2, 20)-1) return -1;
                    stack.push(sum);
                    break;
                case "-":
                    if(stack.empty()) return -1;
                    int topElement = stack.pop();
                    if(stack.empty()) return -1;
                    int difference = topElement - stack.pop();
                    if(difference < 0 || difference > Math.pow(2, 20)-1) return -1;
                    stack.push(difference);
                    break;
            }
        }

        if(stack.isEmpty()) return -1;
        return stack.pop();

    }

    public boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
