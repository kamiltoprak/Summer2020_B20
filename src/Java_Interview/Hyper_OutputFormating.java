package java_Interview;
import java.util.*;
public class Hyper_OutputFormating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            String s2=s1;
            for (int j = s2.length(); j <=15 ; j++) {
                s2+=" ";
            }

            int x = sc.nextInt();
            if (x < 100) {
                s2+=0+x;
            } else {
                s2+=x;

            }

        }


        System.out.println("================================");

    }
}
