package ReplitTry;
/*Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.

        for example:

        plus_minus (new int[]{1,2,55,-9,-2,0});

        will output:
        positives:3, negatives:2, zeros:1*/
import java.util.Scanner;
public class R152_Methods_PlusMinus {




        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int size = inp.nextInt();
            int[] arr = new int[size];
            for(int i=0 ;i<=size-1;i++)
            {

                arr[i]=inp.nextInt();
            }

            plus_minus(arr);
        }//end main

        public static void plus_minus(int[] arr) {
            int positive=0;
            int negative=0;
            int zero=0;
            for(int each:arr){
                if(each>0){
                    positive++;
                }
                if(each<0){
                    negative++;
                }
                if(each==0){
                    zero++;
                }
            }
            System.out.println("positives:"+positive+",");
            System.out.println("negatives:"+negative+",");
            System.out.println("zeros: "+zero);


        }





    }

