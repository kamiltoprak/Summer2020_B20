package day10_ifStatement;

import java.util.Scanner;

public class Score {

        public static void main(String[] args) {
            Scanner scans=new Scanner(System.in);
            int grade=scans.nextInt();
            if (grade >= 90){
                System.out.println("Your grade A");
            }else if( grade < 90 && grade >= 80){
                System.out.println("your Grade B");
            }else if(grade < 80 && grade >= 70){
                System.out.println("Your Grade C");
            }else if (grade < 70 && grade >= 60) {
                System.out.println("Your Grade D");
            }else{
                System.out.println("Your Grade F");
            }

        }

    }
