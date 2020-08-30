package java_Interview;

import java.util.ArrayList;
import java.util.Scanner;

public class Hacker_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] arr=new String[s.length()-(k-1)];
        for(int i=0; i<s.length()-(k-1);i++){

            arr[i]=(s.substring(i,i+k));
        }
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        if(k<=1){
            for(String each:arr){
                if(each.charAt(0)<small){
                    small=each.charAt(0);
                    smallest=each;
                }


                if(each.charAt(0)>large){
                    large=each.charAt(0);
                    largest=each;
                }
            }
        }else{
            for(String each:arr){
                if(each.charAt(0)<small){
                    small=each.charAt(0);
                    smallest=each;
                }else if(each.charAt(0)==smallest.charAt(0) && each.charAt(1)<smallest.charAt(1)){
                    smallest=each;
                }



                if(each.charAt(0)>large){
                    large=each.charAt(0);
                    largest=each;
                }else if(each.charAt(0)==largest.charAt(0) && each.charAt(1)>largest.charAt(1)){
                    largest=each;
                }else if(each.charAt(0)==largest.charAt(0) && each.charAt(1)==largest.charAt(1) && each.charAt(2)>largest.charAt(2)){
                    largest=each;
                }else if(each.charAt(0)==largest.charAt(0) && each.charAt(1)==largest.charAt(1) && each.charAt(2)==largest.charAt(2) && each.charAt(3)>largest.charAt(3)){
                    largest=each;

                }


            }








            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

        }
        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}

