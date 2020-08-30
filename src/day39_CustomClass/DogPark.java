package day39_CustomClass;

public class DogPark {
    public static void main(String[] args) {
        // dog park\
        //Dog dog1=new Dog();
        Dog[] dogPark={new Dog(),new Dog(),new Dog(),new Dog(),new Dog()};
                        //0         1        2       3       4

        for (int i = 0; i <= dogPark.length-1 ; i++) {
            dogPark[i].getDogInfo();

        }
        System.out.println("====================================");
        dogPark[0].setDogInfo("Karaoglan", "German Shepperd", "Medium",  6, "Black");
        dogPark[1].setDogInfo("Red", "Golden", "Medium",  4, "Yellow");
        dogPark[2].setDogInfo("Akbas", "Anatolian Sheppard", "Large",  2, "White");
        dogPark[3].setDogInfo("mike","Poodle","Big",8,"brown");
        dogPark[4].setDogInfo("Grizzly","BoxerPitt","Large",3,"Mix");

        for (int i = 0; i <= dogPark.length-1 ; i++) {
            dogPark[i].getDogInfo();
        }

        System.out.println("=============================================================");
        for (Dog eachdog:dogPark) {
            eachdog.getDogInfo();
        }

        System.out.println("=============================================================");
        String food="treat";
        for (Dog eachdog:dogPark) {
            eachdog.eat(food);
        }

        System.out.println("=============================================================");
        String drink="milk";
        for (Dog eachdog:dogPark) {
            eachdog.drink(drink);
        }


        System.out.println("=============================================================");
        //play
        for (Dog eachdog:dogPark) {
            eachdog.sleep();
        }

        System.out.println("=============================================================");
        //sleep
        for (Dog eachdog:dogPark) {
            eachdog.sleep();
        }
    }
}
