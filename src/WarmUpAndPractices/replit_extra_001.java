package WarmUpAndPractices;
import java.util.Scanner;

public class replit_extra_001 {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String s = inp.nextLine();
            //write your code below

            int k=0 ;

            s=s.replaceAll(" ","");
            System.out.println(s);
            for(int i=s.length()-1; i>=0;i--){
                if(!s.substring(i,i+1).equalsIgnoreCase(s.substring(k,k+1))){
                    System.out.println(false);
                    break;
                }
                k++;
            }
            if(k==s.length()){
                System.out.println(true);
            }
            System.out.println(k);



        }
    }

