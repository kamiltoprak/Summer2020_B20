package day44_Constructor;


import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {
        Dog dog1=new Dog("husk","Alaskan husky","medium",6,"white");
        Dog dog2=new Dog("Mike","Klee Kai","medium",5,"black");
        Dog dog3=new Dog("Jo","Malamute","small",2,"mix");
        Dog dog4=new Dog("jane","Bulldog","medium",4,"brown");


        System.out.println(dog1);
        System.out.println("=========");
        System.out.println(dog2);
        System.out.println("=========");
        System.out.println(dog3);
        System.out.println("=========");
        System.out.println(dog4);
        System.out.println("=================================================");

        ArrayList<Dog> list=new ArrayList<>();
        list.addAll(Arrays.asList(dog1,dog2,dog3,dog4));
        System.out.println("you  have "+list.size()+" dogs");
        System.out.println("=================================================");

        list.removeIf(p->p.age>=5);
        System.out.println(list.size());
        System.out.println(list);

    }
}
