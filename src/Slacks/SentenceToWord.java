package Slacks;

import java.util.Arrays;
import java.util.Scanner;

/*This problem was asked by Microsoft.
        Given a dictionary of words and a string made up of those words (no spaces),
        return the original sentence in a list. If there is more than one possible reconstruction,
        return any of them. If there is no possible reconstruction, then return null.
        For example, given the set of words 'quick', 'brown', 'the', 'fox',
        and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
        Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond',
        and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or
        ['bedbath', 'and', 'beyond'].*/
public class SentenceToWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many  word do you  have ");
        int number=scan.nextInt();
        String[] word=new String[number];
        for (int i = 0; i <number ; i++) {
            System.out.println("enter your word "+(i+1));
            word[i]=scan.next();
        }
        System.out.println("enter your sentences without space");
        String sentence=scan.next();


        for (int k = 0; k < word.length; k++) {
            String firstWord=word[k];
            String transfer="";
            for (int i = 0; i < word.length; i++) {
                    if (sentence.contains(word[i])&&sentence.indexOf(firstWord) >= sentence.indexOf(word[i])) {
                        transfer=firstWord;
                        firstWord = word[i];
                        word[i]=transfer;
                    }
            }
            word[k]=firstWord;
            sentence=sentence.replaceFirst(firstWord,"");
        }
        System.out.println(Arrays.toString(word));

    }
}
