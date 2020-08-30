package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {
    public Constructor(){

        System.out.println("NO arguments cons.");


    }

    public Constructor(int a){

        System.out.println("with int  arguments");


    }
    public Constructor(String a){

        System.out.println("with String  arguments");


    }

    public Constructor(int a,float b){

        System.out.println("with String  arguments");


    }

   public Constructor(float a,int b){

        System.out.println("with String  arguments");


    }

    public static void main(String[] args) {
        Constructor obj1=new Constructor(10);
        Constructor obj2=new Constructor();
        Constructor obj3=new Constructor("Muhtar");


        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list2=new ArrayList<>(list1);
        System.out.println(list2);



    }
}
