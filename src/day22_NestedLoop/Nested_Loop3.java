package day22_NestedLoop;

public class Nested_Loop3 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("============");
        int a=1;
        while(a<=10) {

            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            a++;

        }
        System.out.println("========================");
        int b=1;
        while(b<=4) {

            for (int j = 1; j <=7 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            b++;

        }

    }
}
