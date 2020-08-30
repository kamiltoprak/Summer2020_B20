package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {
        ArrayList<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','P','D','D','A','C','B'));

        System.out.println(chars);
        Collections.sort(chars);

        ArrayList<String> students=new ArrayList<>(Arrays.asList("Aslan", "Cristina", "Zeliha", "Imam", "Fatima", "Mohammed"));
        //                                                          0           1       2           3       4       5
        System.out.println(students);
        Collections.swap(students,1,4);
        System.out.println(students);
        Collections.swap(students,1,4);
        System.out.println(students);
        Collections.swap(students,1,students.size()-1);
        System.out.println(students);
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);


        System.out.println("==================================================");

        ArrayList<String> items=new ArrayList<>(Arrays.asList("Coffee","Coffee","Egg","Water","Butter","Battery","Battery","Battery","Battery"));
        System.out.println(items);
        int count=Collections.frequency(items,"Battery");
        System.out.println(count);

        ArrayList<String> unique=new ArrayList<>();
        items.removeIf(p->Collections.frequency(items,p)>1);
        unique.addAll(items);
        /*
        for (String each:items) {
        int num=Collections.frequency(items,each);
        if(num==1){
            unique.add(each);
        }*/

        System.out.println(unique);
        System.out.println("=================================================");

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,6,343,232,12,43,353,3434,34,3232,4546));
        Integer max=Collections.max(nums);
        Integer min=Collections.min(nums);
        System.out.println(max);
        System.out.println(min);






    }
}
