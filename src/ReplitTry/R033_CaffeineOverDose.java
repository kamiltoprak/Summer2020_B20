package ReplitTry;
import java.util.Scanner;
/*
Scientists estimate that roughly 10 grams of caffeine consumed at one time is a  lethal overdose.  Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person. In one gram, there is 1000 mg. Please refer to the image above as an example and use any number of variables you want. Dots mean space in the picture.

        Formula to get drink count to cause an overdose is
        10*1000 / numOfMilligrams*/

public class R033_CaffeineOverDose {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scans=new Scanner(System.in);
            System.out.println("Enter number of milligrams in drink:");
            int milliGrams=scans.nextInt();
            int drink=10000/milliGrams;

            System.out.println("It would take about "+drink+ " drinks for a lethal overdose.");



        }
    }

