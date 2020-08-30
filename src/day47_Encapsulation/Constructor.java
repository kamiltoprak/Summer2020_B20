package day47_Encapsulation;

import day46_ConstructorCalls.ConstructorCall2;

public class Constructor {

    static {
        System.out.println("static block");
    }

    public Constructor(int a){
        //this(10);
        //this("A");
        System.out.println("int arg"); // int

    }
    public Constructor(double a){

        this(10);
        System.out.println("double arg"); //double

    }
    public Constructor(String a){
        this(5.5);// int double
        System.out.println("String arg"); //string

    }

    public static void main(String[] args) {
        //new Constructor();
        new Constructor("a");

    }
}
