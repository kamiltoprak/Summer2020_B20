package day28_recap;

import java.util.Arrays;

/*task 1 : int arr2D[] [ ] ={{1,2,3}, {4,5,6,78},{9,10,11,12,13}};

        task 1:
        9 10 11 12 13
        4 5  6  7  8
        1  2 3


        task  2
        3 2 1
        4 5 6 7 8
        9  10 11 12 13

        task 3

        13 12 11 10 9
        8 7 6  5 4
        3 2 1*/
public class MultiD_Array_Practice2 {
    public static void main(String[] args) {


        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7,8}, {9, 10, 11, 12, 13}};
        for (int i=arr2D.length-1;i>=0; i--) {
            int[] arr1D=arr2D[i];
            System.out.println(Arrays.toString(arr1D));
            for (int j = 0; j <arr1D.length ; j++) {
                System.out.print(arr1D[j]+" ");
            }
            System.out.println();
            for(int element:arr1D){
                System.out.print(element+" ");
            }
            System.out.println();
        }

        System.out.println("=====================================");
        for (int i=0; i<=arr2D.length-1; i++) {
            int[] arr1D=arr2D[i];
            System.out.println(Arrays.toString(arr1D));
            for (int j = arr1D.length-1 ; j>=0; j--) {
                System.out.print(arr1D[j]+" ");
            }
          /*  System.out.println();
            for(int element:arr1D){
                System.out.print(element+" ");
            }*/
            System.out.println();
        }

        System.out.println("=====================================");
        for (int i=arr2D.length-1;i>=0; i--) {
            int[] arr1D=arr2D[i];
            System.out.println(Arrays.toString(arr1D));
            for (int j = arr1D.length-1 ; j>=0; j--) {
                System.out.print(arr1D[j]+" ");
            }
          /*  System.out.println();
            for(int element:arr1D){
                System.out.print(element+" ");
            }*/
            System.out.println();
        }



    }
}

