package java_Interview;
/*
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

        if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

        if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

        if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
*/

public class Cyber_Divisibleby3_5_15 {
    public static void main(String[] args) {

        String a="Divisible by3 ";
        String b="Divisible by5 ";
        String c="Divisible by15 ";
        for (int i = 0; i <= 100; i++) {
            if(i%5==0 && i%3==0){
                c+=" "+i;
            }
            if(i%5==0 && i%3!=0){
                b+=" "+i;
            }
            if(i%5!=0 && i%3==0){
                a+=" "+i;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
