package Slacks;
import java.util.*;

public class SetIntro {
        public static void main(String[] args) {
            Set<String> africa1 = new LinkedHashSet<>();
            africa1.add("Tunisia");
            africa1.add("Algeria");
            africa1.add("Senegal");

            // We cannot add with an index
            // africa1.add(1, "Kenya");

            boolean addedInSet = africa1.add("Algeria");
            System.out.println("Algeria was added into the set: " + addedInSet);

            System.out.println("africa1 -> " + africa1);

            Set<String> africa2 = new HashSet<String>(africa1);
            System.out.println("africa2 -> " + africa2);

            Set<String> africa3 = new TreeSet<String>(africa1);
            System.out.println("africa3 -> " + africa3);

            int size = africa2.size();
            boolean contains = africa2.contains("Kenya");
            boolean ableToRemove = africa2.remove("Algeria");
            System.out.println("ableToRemove -> " + ableToRemove);
            System.out.println(africa2);

            Set<String> africa4 = new HashSet<>();
            africa4.isEmpty();


            System.out.println("----Iterating a Set----");
            // Iterating a Set
            // 1st way. Will not work
//		for (int i = 0; i < africa1.size(); i++) {
//			String country = africa1.get(i);
//			System.out.print(country + ", ");
//		}
//		System.out.println();

            // 2nd way
            for (String country : africa1) {
                System.out.print(country + ", ");
            }
            System.out.println();

            // 3rd way
            Iterator<String> it = africa1.iterator();
            while(it.hasNext()) {
                String country = it.next();
                System.out.print(country + ", ");
            }
            System.out.println();


        }
}
