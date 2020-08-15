package Slacks;
import  java.util.*;
public class slack12_august12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("France");
        list.add("Italy");
        list.add("England");

        System.out.println("Intial list: " + list);

        Collections.addAll(list, "Spain", "Germany");

        String[] arr = {"US", "Albania"};

        Collections.addAll(list, arr);
        System.out.println("After adding countries: " + list);

        Collections.sort(list);
        System.out.println("After sorting countries: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting in reverse: " + list);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(46);
        list2.add(2);
        list2.add(35);
        list2.add(91);
        list2.add(17);

        //1st way of finding minimum in a list
        int min = Collections.min(list2);
        int max = Collections.max(list2);
        System.out.println("min -> " + min);
        System.out.println("max -> " + max);

        //2nd way of finding minimum in a list
        Set<Integer> list3 = new TreeSet<Integer>(list2);
        Iterator<Integer> it3 = list3.iterator();
        int min3 = it3.next();
        System.out.println("min3 -> " + min3);
    }
}
