package day30_CustomMethod;

public class ReturnMethod {

    public static void main(String[] args) {
        addition(4,3);
        System.out.println(addition1(4,3)*2);
    }
    public static void addition(int a,int b) {
        int sum= a+b;
        System.out.println(sum);
    }

    public static int addition1(int a,int b) {
        int sum=a+b;
        return sum;
     //   return a+b;
    }
}
