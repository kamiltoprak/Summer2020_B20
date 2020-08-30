package ReplitTry;
/*Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
        Expected Output:  3 6 9 12 15 18*/
public class R099_Loop_Div {
        public static void main(String[] args) {
            int i=1;
            while(i<=20){
                if(i%3==0){
                    System.out.println(i);

                }
                i++;
            }
        }
    }

