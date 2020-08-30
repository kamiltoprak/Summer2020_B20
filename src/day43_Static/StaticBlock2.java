package day43_Static;

import day39_CustomClass.Tester;

public class StaticBlock2 {
    static int a;
    static String b= "cybertek";
    static Tester tester1;
    static Tester tester2;


    static{
       // a=100;
       // b="Cybertek";
        tester1=new Tester();
        tester1.setEmployeeInfo("MEhmet",'s',342452314,"dre345");
        tester2=new Tester();
        tester2.setEmployeeInfo("Ali",'s',345323454,"det223");
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
