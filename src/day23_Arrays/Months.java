package day23_Arrays;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String months[]={"january","february","march", "april","may","june","july","august","september","october","november","decemeber" };
        System.out.println("enter a number between 1-12");
        int n=scan.nextInt();
        System.out.println(months[n-1]);
    }
}
