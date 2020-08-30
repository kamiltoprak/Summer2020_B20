package ReplitTry;
/*
Write a while loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
*/


public class R098_Loops_EvenNumbers {

        public static void main(String[] args) {
            int i=80;
            while(i>=20){
                if(i%2==0){
                    System.out.print(i+" ");
                }
                i--;
            }

        }
    }

