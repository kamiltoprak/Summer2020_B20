package day15_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your  sentence ");
        String sentence=input.nextLine();
        System.out.println("your first letter:"+sentence.charAt(0)+" Your last Letter: "+ sentence.charAt(sentence.length()-1));
            //        System.out.println(" "+sentence.charAt(0)+ sentence.charAt(sentence.length()-1)); if you are adding 2
        //        charts  you  need add  string  to  print put out char



    }
}
