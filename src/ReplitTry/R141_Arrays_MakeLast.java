package ReplitTry;
/*Given an int array, print a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
        Example:
        input: 4 5 6
        output: [0, 0, 0, 0, 0, 6]

        Example:
        input: 0
        output: [0, 0]

        Example:
        input: 1 2 3 4
        output: [0, 0, 0, 0, 0, 0, 0, 4]*/
import java.util.*;
public class R141_Arrays_MakeLast {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i =0; i < size; i++) {
                nums[i] = scan.nextInt();
            }
            //WRITE YOUR CODE HERE
            if(size>=2){
                int number=nums[size-1];
                nums=new int[size*2];
                nums[nums.length-1]=number;
                for(int i=0 ; i<nums.length-1;i++){
                    nums[i]=0;
                }
                System.out.println(Arrays.toString(nums));
            }else{
                nums=new int[2];
                System.out.println(Arrays.toString(nums));
            }


        }
    }