package day35_ArrayList;
/*write a program that can print the list of integers in reversed order
        ex:
        list=> {1,2,3,4,5}
        output: 5 4 3 2 1*/
import java.util.ArrayList;

public class ReverseOrder {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10); //autoBoxing
        list.add(20); //autoBoxing
        list.add(30); //autoBoxing
        //list.add(2,30);
        list.add(40); //autoBoxing
        list.add(50); //autoBoxing
        System.out.println(list.size());
        System.out.println(list);


        for (int i = list.size()-1; i >=0 ; i--) {

            System.out.print(list.get(i) + " ");

        }

    }
}
