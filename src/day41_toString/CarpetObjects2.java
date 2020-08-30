package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {


        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5, 3.5, 7.5, true);
        carpets[1].customOrder(7.5, 4.5, 12.5, false);
        carpets[2].customOrder(6.5, 5.5, 8.5, true);
        carpets[3].customOrder(10, 8.5, 13.5, false);
        carpets[4].customOrder(12, 7.5, 9.5, true);

        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));// add all the carpets
        persianCarpets.removeIf(p->!p.isPersian); // removing the carpets that are not persian


        ArrayList<Carpet> regularCarpets=new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));// add all the carpets
        // regularCarpets.removeIf( p -> p.isPersian); // removing the carpets that are is persian
        regularCarpets.removeAll( persianCarpets );


        System.out.println("Number of persian Carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets: "+regularCarpets.size());



    }




}
