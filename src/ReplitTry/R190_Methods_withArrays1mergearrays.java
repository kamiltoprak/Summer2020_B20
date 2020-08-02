package ReplitTry;
import java.util.Arrays;
/*mergR merges two arrays into one.
        it gets two int arrays and returns an int array

        for example:

        mergR([1,2,3],[4,5,6])
        returns [1,2,3,4,5,6]

        mergR([1,2],[6,8])
        returns [1,2,6,8]

        hint:
        create a length int for the combined length of both arrays.
        create an array with that length (thats the array we will return).
        create an iterator for both arrays (int z=0).

        loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
        then increment the iterator for both arrays (z++).

        do the same for the second array.*/
public class R190_Methods_withArrays1mergearrays {
        public static int[] mergR(int[] a,int[] b) {

            int k=0;
            int[] c=new int[a.length+b.length];

            for(int each:a){
                c[k]=each;
                k++;
            }
            for(int each:b){
                c[k]=each;
                k++;
            }

            return c;
        }//end mergR

        public static void main(String[] args)
        {



        }
    }

