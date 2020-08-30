package Slacks;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 6, 3, 3, 10, 3, 4, 5, 5));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 6, 3, 3, 10, 3, 4, 5, 5));

        // 1st way, using a Set
        Set<Integer> set1 = new LinkedHashSet<Integer>(list1);
        list1.clear();
        list1.addAll(set1);
        System.out.println(list1);

        // 2nd way, checking if I already saw the number before
        List<Integer> newList = new ArrayList<Integer>();

        for (Integer number : list2) {
            if (!newList.contains(number)) {
                newList.add(number);
            }
        }
        System.out.println(newList);

    }
}
