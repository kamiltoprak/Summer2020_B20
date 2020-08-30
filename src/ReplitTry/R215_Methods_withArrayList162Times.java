package ReplitTry;
import java.util.*;

/*ArrayList<Integer> arr1=new ArrayList<>();
        for(Integer each:arr){
        arr1.add(each);
        arr1.add(each);
        }

        return arr1;*/
public class R215_Methods_withArrayList162Times {
    public static void main(String[] args)
    {

        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,45,5));
        System.out.println(twoTimes(arr));

    }
    //create your method below
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr)
    {
        ArrayList<Integer> arr1=new ArrayList<>();
        for(Integer each:arr){
            arr1.add(each);
            arr1.add(each);
        }

        return arr1;

    }
}
