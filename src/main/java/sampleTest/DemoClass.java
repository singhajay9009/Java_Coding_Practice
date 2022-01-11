package sampleTest;

public class DemoClass {

    public static void main(String[] args) {

    String str =  "CBACD";

       StringBuilder sb = new StringBuilder(str);

       char[] chars = str.toCharArray();
       sb.replace(1,3, "");
        System.out.println(sb);
    }
}
