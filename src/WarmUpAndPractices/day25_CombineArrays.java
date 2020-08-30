package WarmUpAndPractices;
/*write a program that can combine two arrays of integers and then print out the maximum number
        Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
        arr3 = {1,2,3,4,5,6,7,8}
        max: 8*/
import java.util.Arrays;

public class day25_CombineArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,};
        int[] arr2={5,6,7,8};
        int max=0;
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i]=arr1[i];
            if(arr3[i]>max){
                max=arr3[i];
            }
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[i+arr1.length]=arr2[i];
            if(arr3[i+arr1.length]>max){
                max=arr3[i+arr1.length];
            }
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println(max);
    }

}
