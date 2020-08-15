package ReplitTry;
import java.util.*;
/*Instructions from your teacher:
        This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.

        It removes any instance of the number it gets from the arraylist.

        for example:

        romoveInst([1,1,2,3,1,4],1)
        returns: [2,3,4]

        romoveInst([3,4,3,3],4)
        returns: [3,3,3]*/
public class R213_Methods_withArrayList14RemoveInstances {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n)
    {
        r.removeIf(p->p==n);
        return r;

    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }//end main
}

