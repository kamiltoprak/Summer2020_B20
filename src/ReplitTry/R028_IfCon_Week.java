package ReplitTry;

/*In this assignment, you need to do couple of things:

        Create an object of Scanner class named scanner.
        Create int variable named day.
        Write an if statement that will print day of the week based on value of the day variable.


        For example:

        if day = 1, then print "It's a Monday!"
        or, if day = 5, then print "It's a Friday!"

        Otherwise (else), print "There is no such a day!"

        #################################################

        input: 1
        output: It's a Monday!

        input: 7
        output: It's a Sunday!*/
import java.util.*;

public class R028_IfCon_Week {

        public static void main(String[] args) {
            // DO NOT CHANGE:
            Scanner input = new Scanner(System.in);
            int day = input.nextInt();
            String[] dayName={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            String dayOfTheWeek="";
            for (int i=0; i<7; i++){
                if(day==i+1){
                    dayOfTheWeek="It's a "+dayName[i]+" !";
                    break;
                }else{
                    dayOfTheWeek="There is no such a day!";
                }
            }

            System.out.println(dayOfTheWeek);

            //WRITE YOUR CODE HERE:


        }
    }
