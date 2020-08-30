package java_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Hacker_ArrayLeftRotations {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int numbers=scan.nextInt();
        int rotation= scan.nextInt();
        int[] nums=new int[numbers];
        for (int i = 1; i <=numbers ; i++) {
            nums[i-1]=i;
        }
        int rotationLeft=rotation%numbers;
        int[] nums2=new int[numbers];
        for (int i = 0; i <numbers ; i++) {
            if(i-rotationLeft<0){
                nums2[i-rotationLeft+numbers]=nums[i];
            }else{
                nums2[i-rotationLeft]=nums[i];
            }

        }

        System.out.println(Arrays.toString(nums2));



    }
}
