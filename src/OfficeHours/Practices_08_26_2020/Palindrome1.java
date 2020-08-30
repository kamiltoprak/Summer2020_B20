package OfficeHours.Practices_08_26_2020;

public class Palindrome1 {

    public static void main(String[] args) {


        String name="level";
        String reversedName="";

        for (int i = name.length()-1; i >=0 ; i--) {
            reversedName+=name.charAt(i);

        }

        System.out.println(name.equalsIgnoreCase(reversedName));

        String word="Elmira";
        String reverseWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverseWord+=word.charAt(i);
        }

        System.out.println(word.equalsIgnoreCase(reverseWord));


    }
}
