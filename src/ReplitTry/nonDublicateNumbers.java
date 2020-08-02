package ReplitTry;
import java.util.Scanner;
public class nonDublicateNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        //TODO: write your code below
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
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
