package java_Interview;
//Write a return method that can concate two arrays
import java.util.Arrays;

public class Cyber_ComcatTwoArray {
    public static void main(String[] args) {
        int[] arr1={1,3,24,56,6,75,565};
        int[] arr2={3,4,6,23,42,42,232,21};
        System.out.println(Arrays.toString(comcatTwoArrays(arr1,arr2)));
    }

    public static int[] comcatTwoArrays(int[] arr1,int[] arr2) {
        int[] arr3=new int[arr1.length+arr2.length];
        int k=0;
        for  (int each:arr1){
            arr3[k]=each;
            k++;
        }
        for (int each2:arr2) {
            arr3[k]=each2;
            k++;

        }

        return arr3;
    }
    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {

            result[i] = each;

            i++;

        }

        for(int each: arr2) {

            result[i] =each;

            i++;

        }

        return result;

    }
}
