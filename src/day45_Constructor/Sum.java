package day45_Constructor;

public class Sum {
    public Sum(int a,int b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }public Sum(double a,double b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }public Sum(int a,int b,int c){
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
    }public Sum(double a,double b, double c){
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
    }

    public static void main(String[] args) {
        /*Sum obj1=new Sum(10,10);
        Sum obj2=new Sum(2.5,2.5);
        Sum obj3=new Sum(2,2,3);
        Sum obj4=new Sum(2.5,2.5,3.5);*/

        new Sum(10,10);
        new Sum(2.5,2.5);
        new Sum(2,2,3);
        new Sum(2.5,2.5,3.5);

    }
}
