package ReplitTry;
/*
Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements

        addElements([10, 40, 50, 3, 1], [11, 0, 500, 44, 1101]);
        --------
        return array after adding values in the arrays:
        [21, 40, 550, 47, 1102]

*/

import java.util.*;

public class R205_Methods_withArrays2addElements {


        public static int[] addElements(int[] ints1, int[] ints2) {


            int[] b=new int[ints2.length];
            for(int i=0; i<ints2.length; i++){
                b[i]=ints1[i]+ints2[i];

            }

            return b;

        }


    }
