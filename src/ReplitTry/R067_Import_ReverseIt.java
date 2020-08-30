package ReplitTry;
/*Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.

        Example:
        input: cat
        output: Too short!

        Example:
        input: singularity
        output: Too long!

        Example:
        input: apple
        output: elppa*/
import java.util.Scanner;

public class R067_Import_ReverseIt {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            if (word.length()>=5){
                if (word.length()==5){
                    char ch1=word.charAt(4);
                    char ch2=word.charAt(3);
                    char ch3=word.charAt(2);
                    char ch4=word.charAt(1);
                    char ch5=word.charAt(0);
                    System.out.println(ch1+""+ch2+""+ch3+""+ch4+""+ch5);
                }else{
                    System.out.println("Too long!");
                }

            }else{
                System.out.println("Too short!");

            }
            //WRITE YOUR CODE HERE

        }
    }

