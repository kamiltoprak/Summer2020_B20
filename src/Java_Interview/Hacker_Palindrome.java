package java_Interview;
/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
        Given a string , print Yes if it is a palindrome, print No otherwise.

        Constraints

        will consist at most  lower case english letters.
        Sample Input

        madam
        Sample Output

        Yes*/

import java.util.*;
public class Hacker_Palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        A=A.replaceAll(" ","");
        char[] ch=A.toCharArray();
        int k=0;
        String a="Yes";
        for (int i=ch.length-1; i>=0;i--){

            if(ch[i]!=ch[k]){
                a="No";
            }
            k++;

        }
        System.out.println(a);

    }

}
