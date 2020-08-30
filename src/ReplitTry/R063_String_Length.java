package ReplitTry;
/*ask the user for his name, capture it on a string using scanner.

        then output the length of the name string.*/

import java.util.*;
public class R063_String_Length {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter your name:");
            String name=s.next();
            System.out.println(name.length());

        }
    }
