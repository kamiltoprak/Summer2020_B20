package java_Interview;
//Given a String with numbers and letters. Output the sum of
// all numbers in given String. For example: Input: String str =
// “jav34ajs4jk6”; Output: 44 (34 + 4 + 6 = 44)

import java.util.Collections;

public class Cyber_AddNumberInTheText {
        public static void main(String[] args) {
            String str="jav34ajs4jk6hjh10kjk7kjkj";
            String numString="0123456789";
            String a="";
            int num1=0;
            str+=" ";
            for (int i = 0; i <str.length() ; i++) {
                if(numString.contains(str.substring(i,i+1))){
                    a+=str.substring(i,i+1);
                }else{
                    if(!a.equals("")){
                        num1+=Integer.parseInt(a);
                        a="";
                    }
                }
            }
            System.out.println(num1);
    }
}
