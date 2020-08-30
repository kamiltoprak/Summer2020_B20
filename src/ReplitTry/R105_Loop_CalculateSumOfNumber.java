package ReplitTry;
/*
calculate the multiplied sum of all the numbers up to the n variable.
for example:
n=2
sum = 1*2 = 2
n=3
sum = 1*2*3 = 6
n = 5
sum = 1*2*3*4*5 = 120
hint: use a loop, and set sum and i (loop iterator) to one at the start
*/

import java.util.*;
public class R105_Loop_CalculateSumOfNumber {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int sum = 1;

            for(int i=1;i<=n;i++){
                sum*=i;
            }
            System.out.println(sum);
        }
    }
