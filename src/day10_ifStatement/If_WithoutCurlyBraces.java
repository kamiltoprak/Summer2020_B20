package day10_ifStatement;

public class If_WithoutCurlyBraces {
    public static void main(String[] args) {
        if (9>10){
            System.out.println("Hello");
            System.out.println("how are you");
        }
        System.out.println("==========================================");
        if(9>10)
            System.out.println("Hello");
            System.out.println("how are you");
        System.out.println("============================================");
        if(10 > 9){
            System.out.println("Hello");
            System.out.println("how are you");
        }
        System.out.println("============================");
        int num=100;
        if(num%2==0)
            System.out.println("even number");
        else
            System.out.println("odd number");

    }
}
