package day19_ForLoop;
/*write a program that can calculate the
\sum of all the even numbers between 1 ~ 100

 write a program that can calculate the
 sum of all the odd numbers between 1 ~ 100*/
public class SumOfEvenOdd {
    public static void main(String[] args) {
        int m=0;
        int n=0;
        for(int i=0 ; i<=100; i++){
            if(i%2==0){
                m+=i;
            }else{
                n+=i;
            }
        }
        System.out.println("Sum of even number: " +m);
        System.out.println("Sum of odd number: " +n);

        System.out.println("==================================================");
        int sumEven=0;
        /*for(int i=0; i<=100;i+=2){
            sumEven+=i;
        }
        System.out.println(sumEven);*/
        for(int i=0; i<=100;i++){
            if(i%2==0) {
                sumEven += i;
            }
        }
        System.out.println(sumEven);
        System.out.println("======================================");
        int sumOdd=0;
        /*for(int i=1; i<=99; i+=2){
            sumOdd+=i;
        }
        System.out.println(sumOdd);*/
        for(int i=0; i<=100; i++){
            if(i!=0){
                sumOdd+=i;
            }
        }
        System.out.println(sumOdd);

    }

}
