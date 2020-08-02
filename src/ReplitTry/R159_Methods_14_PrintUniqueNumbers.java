package ReplitTry;
import java.util.*;
/*Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

        Example:
        input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
        output:
        2
        9
        34*/
public class R159_Methods_14_PrintUniqueNumbers {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i=0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            printUniqueNumbers(nums);
        }

        public static void printUniqueNumbers(int[] nums){

            for(int each:nums){
                int a=each;
                int count=0;
                for(int each1:nums){
                    if(a==each1){
                        count++;
                    }
                }
                if(count==1){
                    System.out.println(a);
                }
            }
            //WRITE YOUR CODE HERE


        }
    }

