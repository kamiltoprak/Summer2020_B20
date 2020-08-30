package day44_Constructor;

public class ConstructorIntro {


    public ConstructorIntro(String arr){
        System.out.println("hello"+arr);

    }


    public static void main(String[] args) {
        //
        ConstructorIntro obj4=new ConstructorIntro("Mahmut");
        ConstructorIntro obj3=new ConstructorIntro("Davut");
        ConstructorIntro obj5=new ConstructorIntro("Zuleyha");

      // ConstructorIntro obj2=new ConstructorIntro();
        // ConstructorIntro obj2=new ConstructorIntro(10);

    }
}
