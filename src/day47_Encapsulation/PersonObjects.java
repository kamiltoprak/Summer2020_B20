package day47_Encapsulation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonObjects {


    public static void main(String[] args) {
        Person person1=new Person("Ali",34,'m', LocalDate.of(2000,10,8));
        Person person2=new Person("mehmet",44,'m', LocalDate.of(1999,11,12));
        Person person3=new Person("den",24,'m', LocalDate.of(1990,12,7));

        person1.setSsn(98767543L);
        person2.setSsn(98456755L);
        person3.setSsn(68562343L);

        person1.setAddress("PA");
        person2.setAddress("VA");
        person3.setAddress("NY");


        person1.setID("df34");
        person2.setID("er21");
        person3.setID("sw56");


        ArrayList<Person> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(person1,person2,person3));


        System.out.println(list1);


    }
}
