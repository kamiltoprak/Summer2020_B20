package ReplitTry;
/*Android is one of the best operating systems in the world that helps the billion of users who use smart phones and tablets. Also, Android versions always had some funny names related to sweets. In this assignment, you need to write a program that will print a name of Android version, based on number.
Please refer to the table beneath, in order to develop your if statement.
        Create an object of Scanner class named scanner. (DONE)
        Create double variable named version.
        Write an if statement that will print android version name based on value of the version variable.
        For example:
        if version = 1.5, then print "Cupcake"
        or, if version = 3.1, then print "Honeycomb"
        or, if version is grater or equals to 4.1 and less or equals to 4.3.1 then print "Jelly Bean"
        hint:  if(version>=4.1 && version<=4.31)
        Otherwise (else), print "Sorry, I don't know this version!"
        #################################################
        input: 1.5
        output: Cupcake

        input: 9.0
        output: Pie

        input: 11.0
        output: Sorry, I don't know this version!*/
import java.util.*;

public class R029_IfCon_AndroidVersions {

        public static void main(String[] args) {
            // DO NOT CHANGE:
            Scanner input = new Scanner(System.in);
            double version = input.nextDouble();
            String[] codeName={"Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","Ice Cream Sandwich","Pie"};
            Double[] versionNumber={1.5,1.6,2.1,2.2,2.3,3.1,4.0,9.0};
            //WRITE YOUR CODE HERE:
            String name="";
            for(int i=0;i<8;i++){
                if(version==versionNumber[i]){
                    name=codeName[i];
                    break;
                }else if(version>=4.1 && version<=4.31){
                    name="Jelly Bean";
                }else if(version>=4.4 && version<=4.44){
                    name="Kitkat";
                }else if(version>=5.0 && version<=5.11){
                    name="Lollipop";
                }else if(version>=8.0 && version<=8.1) {
                    name="Oreo";
                }else{
                    name="Sorry, I don't know this version!";
                }
            }

            System.out.println(name);
        }
    }

