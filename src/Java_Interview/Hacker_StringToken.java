package java_Interview;

import java.util.ArrayList;
import java.util.*;

/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

        Note: You may find the String.split method helpful in completing this challenge.

        Input Format

        A single string, .

        Constraints

        is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
        Output Format

        On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

        Sample Input

        He is a very very good boy, isn't he?
        Sample Output

        10
        He
        is
        a
        very
        very
        good
        boy
        isn
        t
        he
        Explanation

        We consider a token to be a contiguous segment of alphabetic characters.
        There are a total of  such tokens in string , and each token is printed in the same order in which
        it appears in string .*/
public class Hacker_StringToken {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            s = s.trim();
            //s=s.replaceAll("  "," ");
            // Write your code here.
            char[] ch = s.toCharArray();
            String a = "";
            ArrayList<String> list = new ArrayList<>();
            if (s.length() < 1) {
                System.out.println(0);
            } else {
                for (int i = 0; i <= ch.length - 1; i++) {
                    if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= '0' && ch[i] <= '9')) {
                        a += ch[i];
                    } else {
                        if (a.length() >= 1) {
                            list.add(a);
                        }
                        a = "";
                        continue;
                    }

                }
                if ((ch[ch.length - 1] >= 'a' && ch[ch.length - 1] <= 'z') || (ch[ch.length - 1] >= 'A' && ch[ch.length - 1] <= 'Z') || (ch[ch.length - 1] >= '0' && ch[ch.length - 1] <= '9')) {
                    list.add(a);
                }

                System.out.println(list.size());
                for (String each : list) {
                    System.out.println(each);
                }


            }


            scan.close();



       /* public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            scan.useDelimiter("\\Z");
            String s = scan.next().trim();
            if (s.length() > 0) {
                String[] tokens = s.split("[!,?._'@\\s]+");
                System.out.println(tokens.length);
                for(String token : tokens) {
                    System.out.println(token);
                }
            } else {
                System.out.println(0);
            }
            scan.close();
        }*/
        }
    }


