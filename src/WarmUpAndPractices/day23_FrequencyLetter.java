package WarmUpAndPractices;
/*write a prgram that can return the frequency of every single characters from the string:
        ex:
        str1 = "aabbccaa";
        output: a4b2c2
        HINT:
        easier approach:
        1. remove duplicates ==> str2 = "abc"
        2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
        3. result: a4b2c2
        previous section we leaned how to find the frequency of one character.
        you will need to repeat the same steps
        Collapse*/
import java.util.Scanner;
public class day23_FrequencyLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please  enter your word");
        String str=scan.next();

        for (int i = 0; i <str.length(); ) {
            int count=0;
            String a=str.substring(i,i+1);
            for (int j = 0; j < str.length(); j++) {
                if(str.substring(j,j+1).equals(a)){
                    count++;
                }
            }
            str=str.replaceAll(a,"");
            System.out.print(a+count);
        }
    }
}
