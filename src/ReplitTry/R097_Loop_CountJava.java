package ReplitTry;
/*Return the number of times that the string "java" appears anywhere in the given string word.

        Example:
        input: javaxjava
        output: 2

        Example:
        input: javaxjavaapplepearjavaegg
        output: 3*/
import java.util.Scanner;
public class R097_Loop_CountJava {

        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            String word = scan.next();
            int count=0;
            for(int i=0 ; i< word.length(); i++){
                if(word.contains("java")){
                    count++;
                    word=word.replaceFirst("java","");


                }
            }



            System.out.println(count);

        }
    }
