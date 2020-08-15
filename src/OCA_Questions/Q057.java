package OCA_Questions;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
        public class Q057 {
        }
       /* String nameString;
        int age;

        public Q057 (String n, int a) {
            nameString = n;
            age =a;
        }
        public String getName() {
            return nameString;
        }
        public int getAge() {
            return age;
        }
    }
    public class Test {
        public static void checkAge(List<Q057> list, Predicate<Q057> predicate) {
            for (Q057 p : list) {
                if (predicate.test(p)) {
                    System.out.println(p.nameString + " ");
                }
            }
        }
        public static void main(String[] args) {
            List<Q057> iList = Arrays.asList(new Q057("Hank",  45),
                    new Q057("Charlie", 40),
                    new Q057("Smith", 38));
            // Line n1

// Which code fragment, when inserted at line n1, enables the code to print Hank?

//		checkAge (iList, () -> p.getAge() > 40);
//		checkAge (iList, Person p -> p.getAge() > 40);
            checkAge (iList, p-> p.getAge() > 40);
//		checkAge (iList, (Person p) -> {p.getAge() > 40});


        }

    }*/

