package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
//import static day44_Constructor.HumanResources.*; // imports all  statics from HumanResources
public class BankOfAzerbaijan {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        /*list.add(HumanResources.employee1);
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);*/

         /*
        list.addAll( Arrays.asList( employee1, employee2, employee3  )  );
                // by using static import we are able to import the static members, so can call them withou the class name
        */
        list.addAll(Arrays.asList(HumanResources.employee1,HumanResources.employee2,HumanResources.employee3,
                HumanResources.employee4,HumanResources.employee5));

        System.out.println("total  number of Employee "+ list.size());
        System.out.println("=========================================");

        for (Employee each:list) {

            System.out.println(each.name+" : "+ each.salary);
        }








    }
}
