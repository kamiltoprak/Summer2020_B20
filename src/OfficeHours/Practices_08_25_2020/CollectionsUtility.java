package OfficeHours.Practices_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Collction  utility
Swaop
sort
max
min
frequency


 */





public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));

        System.out.println(list1);
        Collections.swap(list1,1,2);
        Collections.swap(list1,list1.size()-2,list1.size()-3);
        System.out.println(list1);



        Collections.sort(list1);

        System.out.println(list1);

        Integer max=Collections.max(list1);
        Integer min=Collections.min(list1);


        System.out.println(" MAximum number: "+max);
        System.out.println(" Minumun number: "+min);

        System.out.println("========================");
        String[] arr={"egg","orange","milk","toilet paper","toilet paper","toilet paper","toilet paper","eggs","milk"};
        ArrayList<String> items=new ArrayList<>();
        items.addAll(Arrays.asList(arr));

        System.out.println(items);

        int count=Collections.frequency(items,"toilet paper");


        //items.removeIf(I->Collections.frequency(items,I)==1);
        items.removeIf(I->Collections.frequency(items,I)!=1);

        System.out.println(count);










    }
}
