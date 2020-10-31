package practice.leetcode.mySolution;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {


    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(new UniqueEmailAddress().numUniqueEmails(emails));

    }


   /* public int numUniqueEmails(String[] emails) {

        StringBuffer strLocalName = new StringBuffer("");

        Set<String> set = new HashSet<>();

        for(String email: emails){

            String localName = email.split("@")[0];
            String domainName = email.split("@")[1];

            char[] chrArr = localName.toCharArray();

            if(localName.contains("+")){
                localName = localName.split("\\+")[0];
            }
            int flag =0;
            for(char c : chrArr){


                if(!(Character.isDigit(c) || (c >= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z') || c == '.' || c == '+' ) ){

                    flag =1;
                    break;
                }
            }

            if(flag == 0){
                if(localName.contains(".")){
                    String [] str =  localName.split("\\.");
                    for(String s: str){
                        strLocalName.append(s);
                    }
                }
                else{
                    strLocalName.append(localName);
                }
                String emailFormed = strLocalName.toString().concat("@").concat(domainName);
                set.add(emailFormed);
                strLocalName = null;
                strLocalName = new StringBuffer("");
            }


        }

        return set.size();

    }*/

   // ============== Better Solution performance wise ================

    public int numUniqueEmails(String[] emails) {

        StringBuffer strLocalName = new StringBuffer("");

        Set<String> set = new HashSet<>();

        for(String email: emails){
            StringBuffer emailFormed = new StringBuffer();
            for(int i=0; i<email.length(); i++){

                char c= email.charAt(i);

                if(c == '+'){
                    while(email.charAt(i) != '@'){
                        i++;
                    }
                    emailFormed.append(email.substring(i));
                    break;
                }
                else if(c == '@'){
                    emailFormed.append(email.substring(i));
                    break;
                }
                else if(c == '.') {
                    continue;
                }
                else{
                    emailFormed.append(c);
                }

            }
            set.add(emailFormed.toString());
        }

        return set.size();

    }
}
