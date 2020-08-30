package ReplitTry;
import java.util.ArrayList;
/*Create a static method that:
        is called repeatAL
        returns nothing
        takes in a single parameter - an ArrayList of Booleans

        This method should modify its ArrayList parameter by repeating its ArrayList values.

        For example, if the parameter is
        (true, false, false)
        The modified ArrayList should be
        (true, false, false, true, false, false)*/
public class R206_Methods_withArrayList12RepeatAll {


        public static void main(String[] args)
        {
           ArrayList<Boolean>  a=new ArrayList<>();
           a.add(true);
           a.add(true);
           a.add(false);
            repeatAL(a);
        }
        //create your method below

        public static void repeatAL(ArrayList<Boolean> a){

           ArrayList<Boolean> b=new ArrayList<>();

            for (int i = 0; i < a.size() ; i++) {
                b.add(a.get(i));
            }
            for (int i = 0; i < a.size() ; i++) {
                b.add(a.size()+i,a.get(i));
            }


            System.out.println(b);

        }


    }
