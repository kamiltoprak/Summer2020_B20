package day34_WrapperClasses;
import java.sql.SQLOutput;
import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();
        scores.add(95); // autoboxing , index is 0
        scores.add(100);// autoboxing , index is 3
        scores.add(85);// autoboxing , index is 4
        scores.add(75);// autoboxing , index is 5
        scores.add(1,65); // index 1
        scores.add(2,45); // index 2

        System.out.println(scores);

        System.out.println(scores.get(2));
        System.out.println(scores.size());





    }
}
