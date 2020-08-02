package OCA_Questions;

public class Q007 {

        static int i;  // static fields gets changed for every object
        int j;
        public static void main(String[] args) {
            Q007 x1 = new Q007();
            Q007 x2 = new Q007();
            x1.i= 3;
            x1.j = 4;
            x2.i= 5;
            x2.j = 6;
            System.out.println(
                    x1.i + " " +
                            x1.j + " " +
                            x2.i + " " +
                            x2.j);
        }
    }
//What is the result?
//A.-3 4 5 6
//B.3 4 3 6
//C.5 4 5 6
//D.3 6 4 6

