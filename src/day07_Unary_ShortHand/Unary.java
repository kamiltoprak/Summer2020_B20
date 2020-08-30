package day07_Unary_ShortHand;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class Unary {

        public static void main(String[] args) {
            System.out.println( -1 + -10);
            //    -1 - 10 ==> -11

            System.out.println(-11 -  -10 );
            //                 -11 + 10 =-1

            //  --:  decrement
            int a = 10;
            a=a-1;// 19
            System.out.println(a);

            int a1=20;
            --a1;
            System.out.println(a1);
            a1--;
            System.out.println(a1);
            a1--;
            System.out.println(a1);

            // ++ increment
            int b = 10;
            b=b+1; //b=11;
            System.out.println(b);
            int b1=30;
            b1++;
            System.out.println(b1);


            int x = 100;
            System.out.println(++x);// 101

            int y = 200;
            System.out.println(--y);// 199

            int t=100;
            System.out.println(t++);
            System.out.println(t);
            int z=300;
            System.out.println(z--);
            System.out.println(z);




        }

    }

