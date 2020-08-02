package day28_recap;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        int[] arr1D={1,2,3};
        //               0 1 2   0 1  2 3 4   0  1  2  3 4 5
        int[][] arr2D= {{1,2,3},{4,5,6,7,8},{9,10,11,12,13,14}};
        //                  0          1        2

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(arr2D[1][3]);
        System.out.println("==========================================================");


        for (int i = 0; i <=arr2D.length-1 ; i++) { //  get  each 1 d  array  from  arr  2d
            int[] each1DArray = arr2D[i];
            //System.out.println(Arrays.toString((each1DArray)));
            for (int j = 0; j <=each1DArray.length-1 ; j++) { // print out  each  elements
                int eachNum=each1DArray[j];
                if(eachNum%2==0){
                    System.out.print(eachNum +"  ");
                }


            }
            System.out.println();
        }
        System.out.println("==========================================================");


        for (int[] each1D:arr2D){
            for(int eachElement:each1D){
                if(eachElement%2!=0){
                    System.out.print(eachElement+" ");
                }
            }
            System.out.println();
        }
    }
}
