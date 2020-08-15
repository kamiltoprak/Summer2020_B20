package java_Interview;
import java.util.*;
public class Hacker_CountingWalley {
    public static void main(String[] args) {
        /*String s = "UDDDUDUU";
        int n = 8;*/
        Scanner scan=new Scanner(System.in);
        String s = scan.next();
        int n=scan.nextInt();
        System.out.println(valley(s, n));
    }

    public static int valley(String s, int n) {
        char[] ch = s.toCharArray();
        int count = 0;
        int valley = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'U') {
                count++;
            } else if (ch[i] == 'D') {
                count--;
            }
            if (count == 0 && ch[i]=='U') {
                valley++;
            }
        }

        return valley;

    }
}
