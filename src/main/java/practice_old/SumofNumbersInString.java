package practice_old;

public class SumofNumbersInString {

    public static void main(String[] args) {
        String str = "1a12b3nh12n1"; //1 + 12 + 3 + 12 + 1= 29

        System.out.println(new SumofNumbersInString().getSum(str));
        System.out.println(new SumofNumbersInString().getSum2(str));
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

    public int getSum2(String str){     // "abc123b34njk23"
        if(str == null) return 0;

        StringBuilder sb = new StringBuilder("");
        int sum = 0;
        for(char c : str.toCharArray()){
           if(Character.isDigit(c)){
                sb.append(c);
           }else{
               if(!sb.toString().equals("")){
                   sum += Integer.parseInt(sb.toString());
               }
               sb = new StringBuilder("");
           }
        }
        sum += Integer.parseInt(sb.toString());
        return sum;
    }

}
