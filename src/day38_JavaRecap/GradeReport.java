package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,74,75,65,56,77,54,54,32,23,56,67,78,67,56,54,89));
        System.out.println(list.size());

        ArrayList<Integer> gradeA=new ArrayList<>(); // 90-100
        gradeA.addAll(list); // First store all  grades
        gradeA.removeIf(p->p<90); // second remove the grades that are not  A
        System.out.println("Grade A: "+ gradeA+" "+gradeA.size()+" Student got A");

        ArrayList<Integer> gradeB=new ArrayList<>(); // 80-89
        gradeB.addAll(list); // first  store all  the grades
        gradeB.removeIf(p->p<80 || p>=90); // second remove grades  are  not B
        System.out.println("Grade B: "+gradeB+" "+gradeB.size()+" Student got B");

        ArrayList<Integer> gradeC=new ArrayList<>();// 70-79
        gradeC.addAll(list);
        gradeC.removeIf(p->p<70 || p>=80);
        System.out.println("Grade C: "+ gradeC+" "+gradeC.size()+" Student got C");

        ArrayList<Integer> gradeD=new ArrayList<>();// 60-69
        gradeD.addAll(list);
        gradeD.removeIf(p->p<60 || p>=70);
        System.out.println("Grade D: "+gradeD+" "+gradeD.size()+"Student got D");

        ArrayList<Integer> gradeF=new ArrayList<>();// 0-59
        gradeF.addAll(list);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);

        //gradeF.removeIf(p->p>60);
        System.out.println("Grade F " + gradeF + " "+gradeF.size()+" Student got F");


        System.out.println("==================================");
        System.out.println(gradeA.size()+" Student got A");
        System.out.println(gradeB.size()+" Student got B");
        System.out.println(gradeC.size()+" Student got C");
        System.out.println(gradeD.size()+" Student got D");
        System.out.println(gradeF.size()+" Student got F");

    }
}
