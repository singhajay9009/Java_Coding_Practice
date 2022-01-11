package sampleTest;

public class StringOperation {

    public static void main(String[] args) {

        String str = "ABDBADCDCDBAAB"; // DD

        String res = new StringOperation().createString(str);
        System.out.println(res);

    }

    public String createString(String str){
        if(str == null || str.isEmpty()) return str;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String tempStr = sb.toString();
            if(tempStr.isEmpty()){
                sb.append(ch);
                continue;
            }
            char prevChar = tempStr.charAt(tempStr.length()-1);
            switch(ch){
                case 'A':
                    if(prevChar == 'B') sb.replace(tempStr.length()-1, tempStr.length(), "");
                    else sb.append('A');
                    break;
                case 'B':
                    if(prevChar == 'A') sb.replace(tempStr.length()-1, tempStr.length(), "");
                    else sb.append('B');
                    break;
                case 'C':
                    if(prevChar == 'D') sb.replace(tempStr.length()-1, tempStr.length(), "");
                    else sb.append('C');
                    break;
                case 'D':
                    if(prevChar == 'C') sb.replace(tempStr.length()-1, tempStr.length(), "");
                    else sb.append('D');
                    break;
            }
        }
        return sb.toString();
    }
}
