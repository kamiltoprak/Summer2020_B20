package day37_ArrayList;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.function.Predicate;
public class Remove_Digits_Letters {
    public static void main(String[] args) {
        ArrayList<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('a','1','2','3','5','f','t','%','$','@','3','&'));
        //chars.removeIf(p->p.isDigit(p) && p.isLetter(p) );
        chars.removeIf(p->Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);

        System.out.println("=======================================================");
        ArrayList<Character> list=new ArrayList<>();
        list.addAll(Arrays.asList('a','1','2','3','5','f','t','%','$','@','3','&'));
        System.out.println(list);
        ArrayList<Character> digits=new ArrayList<>();
        digits.addAll(list);
        //digits.removeIf(p->!p.isDigit(p));
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println("Digit: "+digits);
        ArrayList<Character> letters=new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p->!Character.isLetter(p));
        //letters.removeIf(p->!p.isLetter(p));
        System.out.println("Letters: "+letters);
        ArrayList<Character> specialChar=new ArrayList<>();
        specialChar.addAll(list);
        //specialChar.removeIf(p->Character.isLetter(p)||Character.isDigit(p));
        //letters.removeIf(p->p.isLetter(p) || p.isDigit(p));
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println("Special characters: "+specialChar);









    }
}
