package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,45,55,6,67,7));
        //Predicate<Integer> lessthan5= p-> p<5;
        list.removeIf(p -> p<5);
        System.out.println(list);

        System.out.println("========================================");

        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            numbers.add(i);
        }

        Predicate<Integer> evenNumbers=p -> p%2==0;
        Predicate<Integer> oddNumbers=n -> n%2!=0;

        //numbers.removeIf(evenNumbers);
        numbers.removeIf(p-> p%2==0);
        System.out.print(numbers);
        System.out.println();
        System.out.println("==============================================");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("ali","monica","mehray","musti","sumeyra","hasan","Beril"));
        //names.removeIf(each-> each.startsWith("m") && each.endsWith("i"));
        names.removeIf(kamil -> kamil.startsWith("a"));
        System.out.println(names);

        System.out.println("================================");
        ArrayList<Integer> unique=new ArrayList<>();
        unique.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,7,8,9,7,5));

        unique.removeIf(p-> Collections.frequency(unique,p)!=1); // these  are not unique elements
                                                                    // will  be  removed  from  list

        System.out.println(unique);


        System.out.println("=====================================================");
        ArrayList<Character> char1=new ArrayList<>();
        char1.addAll(Arrays.asList('a','a','b','b','1','2','2','3','3','4','%','$','#','$','%','@','#'));
        char1.removeIf(p->Character.isDigit(p) || Character.isAlphabetic(p) );
        System.out.println(char1);





    }
}
