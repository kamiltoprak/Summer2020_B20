package ReplitTry;
import java.util.*;
public class R170_MultiLoop_Zombi2 {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }*/

        int[] result = {0, 0, 0, 0, 0, 0, 0, 0,};
        int[] inhabitants={3, 6, 0, 4, 3, 2, 7, 0};
        System.out.println("Day " + 0 + " " + Arrays.toString(inhabitants));
        //TODO. Write you code below this line.
        int count=0;
        while (!Arrays.equals(inhabitants, result)){
            for (int i = 0; i <= inhabitants.length - 1; i++) {
                if ((i>0 && i< inhabitants.length - 1) &&( inhabitants[i+1] == 0 || inhabitants[i-1] == 0 )) {
                    inhabitants[i] = inhabitants[i] / 2;
                }
               if (i>0 && i<inhabitants.length - 1 && inhabitants[i+1] != 0 && inhabitants[i-1] != 0 ) {
                    inhabitants[i] = inhabitants[i];
                }
                /*if (i>0 && i<inhabitants.length - 1 &&  inhabitants[i+1] != 0 && inhabitants[i-1] == 0 ) {
                    inhabitants[i] = inhabitants[i] / 2;
                }*/

                if (i == 0 && inhabitants[i+1]==0) {
                    inhabitants[i] = inhabitants[i] / 2;
                }

                if (i == inhabitants.length - 1 && inhabitants[i-1]==0) {
                    inhabitants[i] = inhabitants[i] / 2;
                }


            }
            count++;
            System.out.println("Day " + count+ " " + Arrays.toString(inhabitants));
        }


    }
}

