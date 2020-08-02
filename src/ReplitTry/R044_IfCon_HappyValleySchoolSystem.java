package ReplitTry;
/*In the Happy Valley School System, children are classified by age as follows:

        less than 2, ineligible
        2, toddler
        3-5, early childhood
        6-7, young reader
        8-10, elementary
        11 and 12, middle
        13, impossible
        14-16, high school
        17-18, scholar
        greater than 18, ineligible

        Given an int variable age, write an if statement that prints out, on a line by itself,
        the appropriate label from the above list based on age.

        Example:
        -Display prompt: Enter age:
        8
        -Display prompt: elementary*/
import java.util.*;

public class R044_IfCon_HappyValleySchoolSystem {

        public static void main(String[] args) {
            //DO NOT CHANGE:
            Scanner input = new Scanner(System.in);

            System.out.println("Enter age:");
            int age = input.nextInt();
            String ageName="";
            if (age>=2 && age<=18){
                if (age==2){
                    ageName="toddler";
                }  else if (age>=3 && age<=5){
                    ageName="early childhood";
                } else if (age>=6 && age<=7){
                    ageName="young reader";
                } else if (age>=8 && age<=10){
                    ageName="elementary";
                } else if (age==11 && age==12){
                    ageName="middle";
                } else if (age==13){
                    ageName="imposible";
                } else if(age>=14 && age<=16){
                    ageName=  "high school";
                }else{
                    ageName="Scholars";
                }
            }else{
                ageName="ineligible";
            }
            System.out.println(ageName);


            //WRITE YOUR CODE HERE

        }
    }

