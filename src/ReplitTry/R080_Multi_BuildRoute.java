package ReplitTry;
/*Write a program that will print out route instructions. Your program should take 2 parameters: start point and endpoint. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to endpoint - display: "start/end(start or end variable!) found".
        Note: you may move only clockwise.
        Example:
        Input: A
        Input: D
        Output: right > down > left: D found

        Input: C
        Input: C
        Output: C found*/
import java.util.Scanner;
public class R080_Multi_BuildRoute {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String start = scan.next();
            String end = scan.next();
            String road="";
            if(start.equals(end)){
                System.out.println(start+" found");
                System.exit(0);
            }
            char ch1=start.charAt(0);
            char ch2=end.charAt(0);


            if (ch1=='A'){
                switch (ch2){
                    case 'B':
                        road="right";
                        break;
                    case 'C':
                        road="right > down";
                        break;
                    case 'D':
                        road="right > down > left";
                        break;
                }

            }else if (ch1=='B'){
                switch (ch2){
                    case 'C':
                        road="down";
                        break;
                    case 'D':
                        road="down > left";
                        break;
                    case 'A':
                        road="down > left > up";
                        break;

                }

            }else if (ch1=='C'){
                switch (ch2){
                    case 'D':
                        road="left";
                        break;
                    case 'A':
                        road="left > up";
                        break;
                    case 'B':
                        road="left > up > right";
                        break;
                }
            }
            else if (ch1=='D'){
                switch (ch2){
                    case 'A':
                        road="up";
                        break;
                    case 'B':
                        road="up > right";
                        break;
                    case 'C':
                        road="up > right > down";
                        break;

                }
            }
            System.out.println(road+": "+ch2+" found");

        }
    }
