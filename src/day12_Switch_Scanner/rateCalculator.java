package day12_Switch_Scanner;
import java.util.Scanner;
public class rateCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your annual salary: ");
            double salary =  input.nextDouble();
            System.out.println("How many hours do you work in a week");
            int weeklyHour = input.nextInt();  // 40 hours in a week

            int totalHours = weeklyHour * 52;

            double hourlyRate = salary / totalHours;

            System.out.println("Your hourly rate is: $"+hourlyRate);

        }

    }


