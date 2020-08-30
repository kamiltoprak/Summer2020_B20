package java_Interview;
import java.util.Scanner;

public class FirstLetterOfName {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("n");
            int n = scan.nextInt();
            String [] names = new String [n];
            String a="";
            for(int i = 0; i < n; i++){
                names [i]= scan.next();
                a+=names[i].substring(0,1);
            }
            System.out.println(a);
        }
    }

