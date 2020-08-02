package Java_Interview;
/*Find first non-duplicate letter in a given string.
        Ex: String = “testoftest” -----> output: o. Note: Cozumlerinizi lutfen
        thread kisinda yaziniz.*/

import java.util.*;
public class NonDublicateLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String a="";
        for (int j = 0; j < word.length(); j++) {
            char ch=word.charAt(j);
            if(word.indexOf(ch)==word.lastIndexOf(ch)){
                System.out.println(""+ch);
                break;
            }
        }
        System.out.print(a);
    }
}
