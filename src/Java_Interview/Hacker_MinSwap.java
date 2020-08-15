package java_Interview;
/*You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

        For example, given the array  we perform the following steps:

        i   arr                         swap (indices)
        0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
        1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
        2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
        3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
        4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
        5   [1, 2, 3, 4, 5, 6, 7]
        It took  swaps to sort the array.

        Function Description

        Complete the function minimumSwaps in the editor below. It must return an integer representing the minimum number of swaps to sort the array.

        minimumSwaps has the following parameter(s):

        arr: an unordered array of integers
        Input Format

        The first line contains an integer, , the size of .
        The second line contains  space-separated integers .

        Constraints

        Output Format

        Return the minimum number of swaps to sort the given array.

        Sample Input 0

        4
        4 3 1 2
        Sample Output 0

        3
        Explanation 0

        Given array
        After swapping  we get
        After swapping  we get
        After swapping  we get
        So, we need a minimum of  swaps to sort the array in ascending order.

        Sample Input 1

        5
        2 3 4 1 5
        Sample Output 1

        3
        Explanation 1

        Given array
        After swapping  we get
        After swapping  we get
        After swapping  we get
        So, we need a minimum of  swaps to sort the array in ascending order.

        Sample Input 2

        7
        1 3 5 2 4 6 7
        Sample Output 2

        3
        Explanation 2

        Given array
        After swapping  we get
        After swapping  we get
        After swapping  we get
        So, we need a minimum of  swaps to sort the array in ascending order.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Hacker_MinSwap {

   public static void main(String[] args) {
      /*  Scanner scan=new Scanner(System.in);
        int arrSize= scan.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        //int[] arr=new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            list.add(scan.nextInt());
        }
        System.out.println(list);
        int count=0;

        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 1; i <= arrSize; i++) {
            list1.add(i);
        }

        int k=0;
        for (int i = 0; i < arrSize; i++) {
            if (list.get(i)!=list1.get(i)) {
                    Integer a=list.indexOf(i+1);
                    Collections.swap(list,k,a);
                    count++;
            }
            k++;
        }

        System.out.println(count);*/
           Scanner scan=new Scanner(System.in);
           int arrSize= scan.nextInt();
           int[] list=new int[arrSize];
           //int[] arr=new int[arrSize];
           for (int i = 0; i < arrSize; i++) {
               list[i]=scan.nextInt();
           }
           System.out.println(Arrays.toString(list));
           int count=0;
           for (int i = 0; i < arrSize; i++) {
               if (list[i]!=(i+1)) {
                   count++;

                   for (int j = 0; j < arrSize; j++){
                       int b=0;
                       if(list[j]==i+1){
                           b=list[j];
                           list[j]=list[i];
                           list[i]=b;
                           break;
                       }
                   }
               }
           }


      /* for (int i = 0; i < arrSize; i++) {
           if (list[i] != (i + 1)) {
               count++;
           }
       }
       count--;*/
       System.out.println(count);


   }
}

/*4
        4 3 1 2*/
