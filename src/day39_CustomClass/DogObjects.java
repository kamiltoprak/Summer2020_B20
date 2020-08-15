package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();
        Dog dog4=new Dog();
        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();
        dog4.getDogInfo();

        System.out.println("============================================================================");
        dog1.setDogInfo("dany","bulldog","Big",12,"white");
        dog2.setDogInfo("mike","Poodle","Big",8,"brown");
        dog3.setDogInfo("jen","Great Dane","middium",5,"black");
        dog4.setDogInfo("jojo","Beagle","small",3,"black/white");
        System.out.println("======================================================");
        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();
        dog4.getDogInfo();
        System.out.println("==========================================");
        dog1.eat("meat");
        dog2.eat("milk");
        dog3.eat("bread");
        dog4.eat("bone");
        System.out.println("======================================================");

        dog4.drink("water");
        dog3.drink("soda");
        dog2.drink("minaral water");
        dog1.drink("juice");
        System.out.println("=========================================================");

        dog4.sleep();
        dog3.sleep();
        dog2.sleep();
        dog1.sleep();

    }
}
