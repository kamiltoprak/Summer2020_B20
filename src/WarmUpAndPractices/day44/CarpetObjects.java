package WarmUpAndPractices.day44;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(12,12,23,true);
        Carpet carpet2=new Carpet(10,14,25,false);
        Carpet carpet3=new Carpet(13,15,20,false);
        Carpet carpet4=new Carpet(13,14,22,true);
        Carpet carpet5=new Carpet(13,11,21,false);

        ArrayList<Carpet> carpets=new ArrayList<>();
        carpets.addAll(Arrays.asList(carpet1,carpet2,carpet3,carpet4,carpet5));
        System.out.println(carpets.size());
        double a=0;
        for (Carpet each:carpets) {
            a+=each.calcCost();
        }
        System.out.println("  total price  of  all carpets "+a);
        System.out.println("==============================");
        ArrayList<Carpet> persian=new ArrayList<>();
        ArrayList<Carpet> regular=new ArrayList<>();
        for (Carpet each:carpets)
        {
            if(each.isPersian){
                persian.add(each);
            }else{
                regular.add(each);
            }

        }
        System.out.println(regular);
        System.out.println(regular.size());
        double b=0;
        for (Carpet each:regular) {
            b+=each.calcCost();
        }
        System.out.println("  total price  of  regular carpets "+b);
        System.out.println("====================");
        System.out.println(persian);
        System.out.println(persian.size());
        double c=0;
        for (Carpet each:persian) {
            c+=each.calcCost();
        }
        System.out.println("  total price of persian carpets "+c);




    }
}
