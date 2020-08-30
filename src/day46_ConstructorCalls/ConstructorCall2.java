package day46_ConstructorCalls;

import day45_Constructor.Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){

        System.out.println("A");

    }
    public ConstructorCall2(int a){
            //ConstructorCall2();
        this();//calling default constructor
        System.out.println("B");
    }

    public ConstructorCall2(String str){
            this(4);// A,B,C
        System.out.println("C");

    }

    public ConstructorCall2(char a){
        this();// A,B,C
        System.out.println("D");

    }
    public ConstructorCall2(double a){
        this(10);//
        System.out.println("D");

    }


    public static void main(String[] args){

        new ConstructorCall2('a');

    }

}
