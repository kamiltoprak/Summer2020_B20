package ReplitTry;
import java.util.*;
/*In this task, you need to write 2 methods findMax() that will find a maximum number in the array. First method should work with array of integers (int[]) and return int, and second method should work with an array of doubles (double[]) and return double as a result.
        Methods must have the same name and different parameters.
        Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

        Comment: Methods should be non static and with a return type.*/
public class R188_Method_Overloading1 {

        //WRITE YOUR CODE HERE
        public static double findMax(double[] nums) {
            double max=nums[0];
            for(double each:nums){
                if(max<=each){
                    max=each;
                }
            }

            return max;
        }

        public static int findMax(int[] nums) {
            int max=nums[0];
            for(int each:nums){
                if(max<=each){
                    max=each;
                }
            }


            return max;

        }



    }

