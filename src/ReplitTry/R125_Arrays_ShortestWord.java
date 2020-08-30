package ReplitTry;
/*Write a program that will print the shortest word in the given array str.

        input: java, cable, red, vivid, remedy, grace
        output: red*/
import java.util.Scanner;
public class R125_Arrays_ShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};


        String b=str[0];
        for(int i=1; i<str.length; i++){
            if(b.length()>str[i].length()){
                b=str[i];
            }

        }
        System.out.println(b);
    }
}
