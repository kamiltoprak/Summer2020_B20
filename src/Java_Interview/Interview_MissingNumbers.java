package java_Interview;
/*Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
        For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
        You can modify the input array in-place.*/
import java.util.*;

public class Interview_MissingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many number you want  to  enter ");
        int n = scan.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter your number");
            number[i] = scan.nextInt();
        }
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (number[i] > 0) {
                if (number[i] == 1 || count > 0) {
                    count++;
                    if (number[i + 1] - number[i] > 1) {
                        for (int j = number[i] + 1; j < number[i + 1]; j++) {
                            System.out.println(j + " is missing ");
                        }
                    }
                } else if (count == 0) {
                    for (int j = 1; j < number[1]; j++) {
                        System.out.println(j + " is missing ");
                    }
                    if (number[i + 1] - number[i] > 1) {
                        for (int j = number[i] + 1; j < number[i + 1]; j++) {
                            System.out.println(j + " is missing ");
                        }
                    }
                }
            }
        }

    }
}