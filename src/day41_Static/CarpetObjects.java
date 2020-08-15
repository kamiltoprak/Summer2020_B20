package day41_Static;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customOrder(4.5,3.5,7.5,true);
        carpets[1].customOrder(7.5,4.5,12.5,false);
        carpets[2].customOrder(6.5,5.5,8.5,true);
        carpets[3].customOrder(10,8.5,13.5,false);
        carpets[4].customOrder(12,7.5,9.5,true);
        for (Carpet each:carpets) {
            each.getCarpetInfo();
        }


        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        ArrayList<Carpet> regularCarpets=new ArrayList<>();

        for (int i = 0; i < carpets.length; i++) {


        }

    }

}
