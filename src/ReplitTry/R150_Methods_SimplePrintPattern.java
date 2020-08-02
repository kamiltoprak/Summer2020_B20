package ReplitTry;
/*Create a method printHollowRect that prints a 5 on 5 hollow rectangle:


        *****
        *   *
        *   *
        *   *
        *****

        hint:you will need to use two nested for loops for that,
        and an if that checks if its the last or first iteration of the loop
        (so you will know whet to print "*" or " ")*/

public class R150_Methods_SimplePrintPattern {
        public static void printHollowRect()
        {
            // write your codes here
            for(int i=0; i<=4; i++){
                for(int j=0; j<=4; j++){
                    if((j>0 && j<4)&& (i>0 && i<4)){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {

            printHollowRect();
        }
    }

