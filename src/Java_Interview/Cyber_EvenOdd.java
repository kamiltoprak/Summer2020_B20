package java_Interview;
/*Write  a method which can identifies given number is even or odd

        EX:

        identify(5) ->  "Odd"

        identify(6) ->  "Even"*/
public class Cyber_EvenOdd {
    public static void main(String[] args) {
        int a=102;
        System.out.println(evenOdd(a));

    }

    public static String evenOdd(int number) {

        return number%2==0? "even":"odd";

    }
    public  static  String  identifyOddEven( int  n ) {

        return  n%2==0 ? "Even" : "odd" ;

    }

}
