package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {
    public static void main(String[] args) {


        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass", 2, 'F', "Black", "Persian");


        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};


        catPark[1].setCatInfo("Bella", 1, 'F', "Black", "Bombay");
        catPark[2].setCatInfo("Leo", 3, 'M', "Gray", "Russian Blue");
        catPark[3].setCatInfo("Mayo", 4, 'M', "Yellow", "Birman");
        catPark[4].setCatInfo("Jack", 5, 'M', "beige", "Turkish");
        catPark[5].setCatInfo("Lord", 8, 'M', "White", "Maine Coon");

        ArrayList<Cat> femaleCats =new ArrayList<>();
        femaleCats.addAll(Arrays.asList(catPark));
        femaleCats.removeIf(p->p.gender=='M');

        ArrayList<Cat> maleCats =new ArrayList<>();
        maleCats.addAll(Arrays.asList(catPark));
        //maleCats.removeAll(femaleCats);
        maleCats.removeIf(p->p.gender=='F');

        System.out.println("Number of Female Cats: "+femaleCats.size());
        System.out.println("Number of Male Cats: "+maleCats.size());


    }
}
