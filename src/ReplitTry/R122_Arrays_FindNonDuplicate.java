package ReplitTry;
/*Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

        Example:

        nums -> [1, 1, 2, 3, 4, 3, 4]
        2*/
import java.util.*;
public class R122_Arrays_FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        //TODO: write your code below
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i!=j) && (nums[i] == nums[j])) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(nums[i]);
            }
        }

    }

}
