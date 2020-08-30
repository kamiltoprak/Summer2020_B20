package ReplitTry;
/*Write a program that will output length of the text (string).

        Example:
        Display message: "Please enter the text:"
        input: java
        Display message: "Length is: 4"*/
import java.util.Scanner;

public class R062_import_FindTheLength {

        public static void main(String[] args) {
            //WRITER YOU CODE HERE

            Scanner input=new Scanner(System.in);
            System.out.println("Please enter the text:");
            String name1=input.next();
            System.out.println("Length is: "+name1.length());



        }
    }

