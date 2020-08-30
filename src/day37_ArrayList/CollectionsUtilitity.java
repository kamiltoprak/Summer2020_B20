package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilitity {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,332,4,5,32,23,424,343,3432,2,2,2));
        Integer max= Collections.max(list); // maximum number
        Integer min= Collections.min(list); // minumum number
        System.out.println("Maximum number:"+ max);
        System.out.println("Minumum number:"+ min);

        System.out.println("========================================================");
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ramazan","Islem","Muhtar","Saim","Muhtar","Asiya"));
        // replaceAll
        Collections.replaceAll(names,"Muhtar","Fatima");

        System.out.println(names);



    }
}
