package ReplitTry;
/*Given an int array of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

        Example:
        input 1, 2, 3
        output: [1, 2]

        Example:
        input 1,
        output: [1]*/
import java.util.*;

public class R139_Arrays_FrontPiece {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] num = new int[size];
            for(int i =0; i < size; i++) {
                num[i] = scan.nextInt();
            }
            //WRITE YOUR CODE HERE
            if(size<3){
                System.out.println(Arrays.toString(num));

            }

            if(size>=3){
                int[] num1 = new int[2];
                for(int i=0; i<=1;i++){
                    num1[i]=num[i];
                }
                System.out.println(Arrays.toString(num1));

            }


        }
    }


