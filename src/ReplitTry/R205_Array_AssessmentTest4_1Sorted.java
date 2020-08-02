package ReplitTry;
import java.util.*;

public class R205_Array_AssessmentTest4_1Sorted {
/*    this is a sorted collection (in this case array):

7,8,9,10

            this is an unsorted collection:

            5,4,9,8,7,3

    sorted in this case means smallest number to biggest.
    you will not do sorting in this assignment.
    you will only check if an array is sorted.

    isSort gets an array and returns true if its sorted.

            for example:
    isSort([2,3,5,4,9]);
    returns: false

    isSort([1,2,3]);
    returns: true

    isSort([7,8,9]);
    returns: true.

    hint:when you loop the array if current number in the array is greater then next number,
    array is not sorted return false.*/

        public static boolean isSort(int[] nums)
        {
            int count=0;
            for(int i=0; i<=nums.length-2; i++){

                if(nums[i+1]-nums[i]==1){
                    count++;
                }

            }
            return count==nums.length-1? true:false;

        }
    }



