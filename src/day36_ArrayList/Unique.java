package day36_ArrayList;

import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        ArrayList<Integer> unique = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            Integer element = list.get(i);
            int count = 0;
            for (Integer each : list) {
                if (each == element)
                    count++;
            }
            if (count == 1) {
                unique.add(element);
            }
        }
        System.out.println(unique);

    }
}
