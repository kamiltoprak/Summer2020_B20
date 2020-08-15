package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet();
        Carpet carpet2=new Carpet();
        Carpet carpet3=new Carpet();
        Carpet carpet4=new Carpet();
        Carpet carpet5=new Carpet();

        carpet1.customerOrder(10,14,12,true);
        carpet2.customerOrder(20,10,3,false);
        carpet3.customerOrder(5,10,34,true);
        carpet4.customerOrder(10,20,6,false);
        carpet5.customerOrder(10,20,6,false);

        ArrayList<Carpet> persianCarpet=new ArrayList<>();
        persianCarpet.addAll(Arrays.asList(carpet1,carpet2,carpet3,carpet4,carpet5));
        persianCarpet.removeIf(p->!p.isPersian);
        ArrayList<Carpet> regularCarpet=new ArrayList<>();
        regularCarpet.addAll(Arrays.asList(carpet1,carpet2,carpet3,carpet4,carpet5));
        regularCarpet.removeIf(p->p.isPersian);
        System.out.println("================================================================");
        for (Carpet each:persianCarpet) {
            each.getCarpetInfo();
            System.out.println("total Cost of this carpet: "+each.calcCost()+200);

        }
        System.out.println("===============================================================");
        for (Carpet each:regularCarpet) {
            each.getCarpetInfo();
            System.out.println("total Cost of this carpet: "+each.calcCost());

        }

    }
}
