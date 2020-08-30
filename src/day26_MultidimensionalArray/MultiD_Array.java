package day26_MultidimensionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        char[] ch1={'A','B'};
        char[] ch2={'C','D','E'};
        char[] ch3={'F','G','H'};

        //               0   1     0    1    2   0   1    2
        char[][] ch2d={{'A','B'},{'C','D','E'},{'F','G','H'}};
        //                  0       1           2
        System.out.println(Arrays.toString(ch2d[1]));
        System.out.println(Arrays.toString(ch2d[2]));

        System.out.println(ch2d[2][2]);
        System.out.println(ch2d[1][0]);

        System.out.println(ch2d[1][0] + "    "+ ch2d[0][1]);
        System.out.println("===========================================");

        int[][] nums={{1,2,3},{4,5,6},{7,8,9},{11,12,13}};
        //              0        1       2          3


        System.out.println(Arrays.toString(nums[3]));
        /*{1,2,3},
        {4,5,6},
        {7,8,9},
        {11,12,13}
         */
        System.out.println("========================================");
        for(int i=0; i<=nums.length-1;i++){
            System.out.println(Arrays.toString(nums[i]));
        }

        System.out.println("========================================");
        System.out.println(Arrays.deepToString(nums));


    }
}
