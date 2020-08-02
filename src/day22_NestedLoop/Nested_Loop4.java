package day22_NestedLoop;

public class Nested_Loop4 {
    public static void main(String[] args) {

           for (int i = 1; i < 7; i++) {
               for (int j = 7 - i; j < 7; j++) {
                   System.out.print("*");
               }
               System.out.println();
           }
           System.out.println("=============");
           for (int i = 1; i < 7; i++) {
               for (int j = 1; j < 8-i; j++) {
                   System.out.print("*");
               }
               System.out.println();
           }


    }
}
