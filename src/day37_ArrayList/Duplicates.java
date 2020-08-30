package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        // removess uniqie characteers
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,1,2,3,2,4,5,6,7,8,3,3,8,9));
        System.out.println(list);
        list.removeIf(p-> Collections.frequency(list,p)==1);
        System.out.println(list);
        System.out.println("===================================================");
        // first letter  and last  letter  are same

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Canada", "Bob", "David","Lan","Abida","Ebrahim","Farida"));
        System.out.println(names);
        //names.removeIf(p->p.toLowerCase().charAt(0)==p.charAt(p.length()-1));
        names.removeIf(p->p.toLowerCase().charAt(0)!=p.charAt(p.length()-1));
        System.out.println(names);
        System.out.println("===================================================================");
        ArrayList<Integer> grades=new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,67,78,76,56,66,77,88,99,55,67,88,48,90));

        ArrayList<Integer> gradeOfA=new ArrayList<>();
        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p->p<=90);
        System.out.println(gradeOfA.size()+" students' grade is A");

        ArrayList<Integer> gradeOfB=new ArrayList<>();
        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p->(p>=90 || p<80));
        System.out.println(gradeOfB.size()+" students' grade is B");

        ArrayList<Integer> gradeOfC=new ArrayList<>();
        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p->(p>=80 || p<70));
        System.out.println(gradeOfC.size()+" students' grade is C");

        ArrayList<Integer> gradeOfD=new ArrayList<>();
        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p->(p>=70 || p<60));
        System.out.println(gradeOfD.size()+" students' grade is D ");

        ArrayList<Integer> gradeOfF=new ArrayList<>();
        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p->p>=60);
        System.out.println(gradeOfF.size()+" students' grade is F");


    }
}
