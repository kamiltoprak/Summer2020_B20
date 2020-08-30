package day36_ArrayList;
/*Array List methods

        indexOf
        lastIndexOf
        contains
        equals
        isEmpty*/
import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(40);
        list.add(70);

        int a = list.indexOf(40);
        System.out.println(a);

        System.out.println(list.indexOf(60));// it is not exit and it  is print out -1
        System.out.println(list.lastIndexOf(40));


        boolean r1 =list.contains(100);
        System.out.println(r1);

        System.out.println("=====================================");

        ArrayList<String> list1= new ArrayList<>();
        list1.add("Cybertek School");

        ArrayList<String> list2 =new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));
        System.out.println("===================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        System.out.println( list3.isEmpty() );





    }
}
