package day07_Unary_ShortHand;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.objects.XString;

public class ShortHand_Operators {
    public static void main(String[] args) {
        // *= multiplication

        int b = 2;
        b *= 3;
        System.out.println(b);

        // -= Subtraction
        int c = 300;
        c -= 100;
        System.out.println(c);

        // += addition
        int z = 300;
        z += 200;
        System.out.println(z);

        String schoolName="Cybertek";
        schoolName += " School";
        System.out.println(schoolName);

        String fullName="Danald";
                fullName +=" Trump";
        System.out.println(fullName);

        //String firstName = "Kamil Toprak";
        //firstName -="Toprak" ;
       // System.out.println(firstName);

        System.out.println("==============================================");

        int X = 100;
        X /=2;
        System.out.println(X);
        X *=2;
        System.out.println(X);
        System.out.println("==========================================");

        int q =100;
        System.out.println(q/2);
        System.out.println(q);

        int num =100;
            num %= 3;
        System.out.println(num);

        double num2 = 400.5;
            num2 %=2;

        System.out.println(num2);

        double frt=0.5;
        System.out.println(frt%2);

        System.out.println("========================================");

    }
}
