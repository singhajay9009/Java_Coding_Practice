package practice_old;

public class SumofNumbersInString {

    public static void main(String[] args) {
        String str = "1a12b3nh12n1"; //1 + 12 + 3 + 12 + 1= 29

        System.out.println(new SumofNumbersInString().getSum(str));
    }

    public int getSum(String str){
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(Character.isDigit(ch)){
               sb.append(ch);
            }else{
                sum = sum + Integer.parseInt(sb.toString());
                sb = new StringBuilder("0");
            }
        }

        sum = sum + Integer.parseInt(sb.toString());

        return sum;
    }

}
