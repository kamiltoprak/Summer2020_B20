package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r1=list.contains(1); //true
        System.out.println(r1);
        ArrayList<Integer> elements=new ArrayList<>();

        elements.add(1);
        elements.add(2);
        elements.add(5);

        boolean r2=list.containsAll(elements); // true

        System.out.println(r2);


        System.out.println("======================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        //verify  that 1,2,4  are  contained  in the  list 2

        boolean r3=list2.containsAll(Arrays.asList(2,1,1,2));

        System.out.println(r3);

        System.out.println("===============================================");
        ArrayList<Integer> numbers = new ArrayList<>();

        // add: 30, 25, 40, 15, 55, 65, 75, 85, 95, 100
        /*
        Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100};
        numbers.addAll(  Arrays.asList(nums) );
         */

        numbers.addAll(  Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100) );

        System.out.println(numbers);


        System.out.println("=======================================");

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,43,3,42,34,1,1,1,10,2,2,2,2,11,5,523,54565,7668787,9967));
        // remove  all 1,2,3,5,10, 11
        System.out.println(nums);
        nums.removeAll(Arrays.asList(1,2,3,5,10,11));
        System.out.println(nums);


        System.out.println("==============================================");
        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.addAll(Arrays.asList(1,2,3,45,6,5,6,7,8,990,8,7,8,7,6,5,4,3,4));
        System.out.println(nums2);
        //only keep  the element  1,2,3,9
        nums2.retainAll(Arrays.asList(1,2,3,9));
        System.out.println(nums2);
        System.out.println("==================================================");
        ArrayList<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Mehmet", "Zumra", "Ahmed", "Dani", "Ahmed"));
        System.out.println(employees);
        employees.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employees);
        employees.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employees);

    }
}
