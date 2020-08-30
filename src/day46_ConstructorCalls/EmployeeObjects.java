package day46_ConstructorCalls;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Cristina");
        System.out.println(employee1);

        System.out.println("=================================");

        Employee employee2=new Employee("Selman","SDET");

        System.out.println(employee2);

        System.out.println("=================================");

        Employee employee3=new Employee("mehmet","QA",12324);
        System.out.println(employee3);

        System.out.println("=================================");

        Employee employee4=new Employee("Mehmet","Computer Engineer",32423,123000.45);
        System.out.println(employee4);

        System.out.println("=================================");

        ArrayList<Integer>  list1=new ArrayList<>();
        ArrayList<Integer>  list2=new ArrayList<>(list1);
        ArrayList<Integer>  list3=new ArrayList<>(Arrays.asList(1,2,3,4,5));



    }
}
