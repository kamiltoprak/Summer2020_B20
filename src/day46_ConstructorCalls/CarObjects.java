package day46_ConstructorCalls;

public class CarObjects {
    public static void main(String[] args) {

        System.out.println(new Car("BMW"));
        System.out.println("==============================");

        System.out.println(new Car("BMW","I8"));
        System.out.println("==============================");

        System.out.println(new Car("BMW","M3",2020));
        System.out.println("==============================");

        System.out.println(new Car("BMW","M5",2012,45000));
        System.out.println("==============================");

        System.out.println(new Car("BMW","X3",2018,34000,"blue" ));
        System.out.println("==============================");
        System.out.println("==============================");

        Car obj1=new Car("BMW");
        System.out.println(obj1);
        System.out.println("==============================");
        Car obj2=new Car("BMW","I8");
        System.out.println(obj2);
        System.out.println("==============================");
        Car obj3=new Car("BMW","M3",2020);
        System.out.println(obj3);
        System.out.println("==============================");
        Car obj4=new Car("BMW","M5",2012,45000);
        System.out.println(obj4);
        System.out.println("==============================");
        Car obj5=new Car("BMW","X3",2018,34000,"blue" );
        System.out.println(obj5);
        System.out.println("==============================");

    }
}
