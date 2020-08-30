package day35_ArrayList;

import javax.swing.plaf.basic.BasicLookAndFeel;
import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> earlybirdList=new ArrayList<>();
        earlybirdList.add("ibrahim");
        earlybirdList.add("Virginia");
        earlybirdList.add("Aalia");
        earlybirdList.add("Ziiadin");
        earlybirdList.add("Erfan");

        earlybirdList.set(2, "Aslan");
        earlybirdList.add(0,"Lan");

        System.out.println(earlybirdList);

        earlybirdList.clear();

        System.out.println(earlybirdList);
        System.out.println(earlybirdList.size());


        System.out.println("=====================");


        ArrayList<Integer> list=new ArrayList<>();
        list.add(1); // 0
        list.add(2); // 1
        list.add(3); // 2
        list.add(4); // 3
        list.add(5); // 4


        System.out.println(list); //1 2 3 4 5
        list.remove(2);
        System.out.println(list); // 1 2 4 5
        list.remove(3);
        System.out.println(list); //
        System.out.println("==========================================");
// remove element
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1); // 0
        list2.add(2); // 1
        list2.add(3); // 2
        list2.add(4); // 3
        list2.add(5); // 4

        Integer a=1;
        //int b=3;
        list2.remove(a);
        //list2.remove(b);


        System.out.println(list2);

        System.out.println("===========================");
        ArrayList<String> list3=new ArrayList<>();
        list3.add("hamit");
        list3.add("liliia");
        list3.add("Bulnet");
        list3.add("Viorel");
        list3.add("Musa");

        //list3.remove(2);
        boolean r=list3.remove("Bulnet");
        boolean r2=list3.remove("Musa");
        System.out.println(list3);
        System.out.println(r);
        System.out.println(r2);







    }
}
