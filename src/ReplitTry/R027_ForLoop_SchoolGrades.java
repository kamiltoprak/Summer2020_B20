package ReplitTry;
/*subject4, subject5, summary;
        Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;

        -Create a Scanner object named scan.

        Execution flow with example:
        -Display prompt :"Welcome to the Grader!"
        -Display prompt: "Please enter subject name number 1 and score for this subject"
        Math
        5.0
        -Display prompt: "Please enter subject name number 2 and score for this subject"
        Biology
        4.2
        -Display prompt: "Please enter subject name number 3 and score for this subject"
        English
        4.4
        -Display prompt: "Please enter subject name number 4 and score for this subject"
        Chemistry
        4.8
        -Display prompt: "Please enter subject name number 5 and score for this subject"
        Music
        3.4

        -build summary variable by concatenating subject names and grades
        calculate average score and define that value into average variable.

        -Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
        -Display prompt: "Your average score is: 4.36"
        -Display prompt: "Thank you for using Grader!"
        -Display prompt: "Goodbye!"*/
import java.util.*;

public class R027_ForLoop_SchoolGrades {
        public static void main(String[] args) {
            // Enter your code here
            Scanner scan=new Scanner(System.in);
            System.out.println("Welcome to the Grader!");
            String[] subject=new String[5];
            double[] grade=new double[5];
            double average=0;
            for(int i=0; i<5; i++){
                System.out.println("Please enter subject name number " +(i+1)+" and score for this subject");
                subject[i]=scan.next();
                grade[i]=scan.nextDouble();
                average+=grade[i];
            }
            System.out.println("Summary: " + subject[0]+" - "+grade[0]+", "+ subject[1]+" - "+grade[1]+", "+ subject[2]+" - "+grade[2]+", "+ subject[3]+" - "+grade[3]+", "+ subject[4]+" - "+grade[4]);
            System.out.println("Your average score is: "+(average/5));
            System.out.println("Thank you for using Grader!");
            System.out.println("Goodbye!");
        }
    }

