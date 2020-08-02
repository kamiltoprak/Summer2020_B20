package day19_ForLoop;

public class OldEven2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) { // in order to print even, we can choose skip odd number

            if (i % 2 != 0) { // if the number is odd, then skip
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 50; i++) {  // in order to print odd, we can choose skip even number

            if (i % 2 == 0) { // if the number is even, then skip
                continue;
            }
            System.out.print(i + " ");

        }
    }
}
