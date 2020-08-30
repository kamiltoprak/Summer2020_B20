package ReplitTry;
import java.util.Arrays;
/*Instructions from your teacher:
        Switch the last element in an array with the first and return the array.

        example:

        do_switch([1,2,3,4])
        returns:[[4,2,3,1]

        do_switch([7,2,3,5])
        returns:[5,2,3,7]*/



public class R232_Switch {

        public static int[] do_switch(int[] i)
        {
            int a=i[0];
            int b=i[i.length-1];
            i[0]=b;
            i[i.length-1]=a;


            return i;

        }
    }

