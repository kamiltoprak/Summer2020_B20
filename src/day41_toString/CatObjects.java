package day41_toString;

import java.util.ArrayList;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass", 2, 'F', "Black", "Persian");


        System.out.println( cat1 );
        System.out.println("================================================");
        Cat[] catPark={cat1,new Cat(),new Cat(),new Cat(),new Cat(),new Cat()};


        catPark[1].setCatInfo("Bella",1,'F',"Black","Bombay");
        catPark[2].setCatInfo("Leo",3,'M',"Gray","Russian Blue");
        catPark[3].setCatInfo("Mayo",4,'M',"Yellow","Birman");
        catPark[4].setCatInfo("Jack",5,'M',"beige","Turkish");
        catPark[5].setCatInfo("Lord", 8, 'M', "White", "Maine Coon");


        for (Cat catEach:catPark ) {
            System.out.println(catEach);
        }
        System.out.println("================================================");

        //System.out.println(Arrays.toString(catPark));

        ArrayList<Cat> femaleCats=new ArrayList<>();
        ArrayList<Cat> maleCats=new ArrayList<>();

       /* for (int i = 0; i < catPark.length; i++) {
            if(catPark[i].gender=='M'){
                maleCats.add(catPark[i]);
            }else{
                femaleCats.add(catPark[i]);
            }
        }*/

        for (Cat each:catPark) {
            if(each.gender=='M'){
                maleCats.add(each);
            }else{
                femaleCats.add(each);
            }
        }


        System.out.println(femaleCats);
        System.out.println(maleCats);


    }
}
