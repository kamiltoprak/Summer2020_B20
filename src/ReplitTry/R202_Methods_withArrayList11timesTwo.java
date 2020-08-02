package ReplitTry;

/*
Create a method that:
        is called timesTwo
        returns nothing
        takes in a single parameter - an ArrayList of Integers called nums

        This method should take the ArrayList parameter and multiply every value by two.
*/
import java.util.ArrayList;

public class R202_Methods_withArrayList11timesTwo {


        public static void main(String[] args)
        {

        }
        //create your method below
        public static void timesTwo(ArrayList<Integer> nums){
            int k=0;
            for(Integer each:nums){
                nums.set(k,each*2);
                k++;
            }
            System.out.println(nums);

        }



    }
