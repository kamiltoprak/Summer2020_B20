package OCA_Questions;

public class Q002 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = (j +=i) / 5;		// k = 30/5 =6
        // (j = j+i) = (j = 30)  in parentheses j is equalized to 30
        System.out.print(i + " : " + j + " : " + k);


            /*int i = 10;
            int j = 20;
            int k = j += i / 5 ;
            // k = j = j + i / 5 ==> first i / 5 = 2, then k = j = j + 2 => 22
            System.out.println(i + " : " + j + " : " + k);*/

    }
}
