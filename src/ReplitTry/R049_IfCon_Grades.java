package ReplitTry;
/*In this assignment you will get a grade int and using ifs output if it's a passing grade or failure.
        if grade is bigger than 90 output "excellent"


        if the grade is bigger than 70 and smaller then 90 output "good"


        if grade is bigger than 60 and smaller than 70 output "pass"


        if grade is smaller than 60 output "fail"
        hint: && is the operator for and in java.*/
import java.util.*;
public class R049_IfCon_Grades {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner s = new Scanner(System.in);

            int grade = s.nextInt();
            if (grade>=90){
                System.out.println("excellent");
            }else if(grade<90 && grade>=70){
                System.out.println("good");
            }else if (grade<70 && grade>=60){
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }

            //Write your code here:





        }
    }

