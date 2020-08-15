package Slacks;
import java.util.*;

public class InitializeArray {
        public static void main(String[] args) {
            List<String> list1 = new ArrayList();
            list1.add("a");
            list1.add("b");
            list1.add("c");
            list1.add(1, "d");
            System.out.println(list1);

            List<String> list2 = new ArrayList<String>() {
                {
                    add("e");
                    add("f");
                    add("g");
                }
            };
            System.out.println(list2);

            // This is immutable, you cannot add/remove objects
            String[] arr = { "h", "i", "j" };
            List<String> list3 = Arrays.asList(arr);
            // This will give a run-time error
            // list3.add("k");
            System.out.println(list3);

            // In this case, list4 is mutable/expendable
            List<String> list4 = new ArrayList<String>(Arrays.asList(arr));
            list4.add("k");
            System.out.println(list4);

            List<String> list5 = new LinkedList<String>(list4);
            System.out.println(list5);

            System.out.println("----Iterating a List----");
            // Iterating a List
            // 1st way
            for (int i = 0; i < list5.size(); i++) {
                String letter = list5.get(i);
                System.out.print(letter + ", ");
            }
            System.out.println();

            // 2nd way
            for (String letter : list5) {
                System.out.print(letter + ", ");
            }
            System.out.println();

            // 3rd way
            Iterator<String> it = list5.iterator();
            while(it.hasNext()) {
                String letter = it.next();
                System.out.print(letter + ", ");
            }
            System.out.println();
        }

}

