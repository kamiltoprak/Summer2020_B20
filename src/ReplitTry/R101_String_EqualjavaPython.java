package ReplitTry;

/*Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
        Example:
        input: We study java not python
        output: true

        Example:
        input: What's the difference between java, javascript and python?
        output: false*/
import java.util.*;
public class R101_String_EqualjavaPython {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    int a=0;
    while(sentence.toLowerCase().contains("java")){
        a++;
        sentence=sentence.replaceFirst("java","");
    }
    int b=0;
    while(sentence.contains("python")){
        b++;
        sentence=sentence.replaceFirst("python","");
    }

    if(a==b){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
}
}

