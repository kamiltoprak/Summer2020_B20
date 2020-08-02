package day07_Unary_ShortHand;

public class Post_VS_Pre {

    public static void main(String[] args) {

        int a=10;
        System.out.println(++a); //11
        System.out.println(a); //11

        System.out.println("===============================================");
        int b=10;
        System.out.println(b++); //10
        System.out.println(b); // 11


        System.out.println("==============================================");
        int c=25;
        int d=c++;  //d=25 ;
        // d=? , c=?
        // c=26
        System.out.println(c);
        System.out.println(d);


        System.out.println("=============================================");
        int e=25;
        System.out.println(e++);
        System.out.println(e);

        System.out.println("================================================");
        int x=8;
        int y=x--; //

        System.out.println("=================================================");
        int A= 1 ;
        A= -A-- +A++ /-A-- *--A ;
        // -A--  after  A=0 and +A++  after A=1 and divided -A-- and after A=0
        //A=-1+0/-1*-1
        //A=-1+(0/-1)*-1
        //A=-1+0*-1
        //A=-1+0
        //A=-1
        System.out.println(A);

        System.out.println("====================================================");
        int B= 50 ;
        B= --B + B++ + B-- + B++ ;
        //
        //
        //
        //
        //
        //
        System.out.println(B);

    }
}





