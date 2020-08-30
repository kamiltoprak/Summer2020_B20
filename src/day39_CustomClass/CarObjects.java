package day39_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();
        /*car1.brand="toyata";
        car1.color="Blue";
        car1.milage=12300;
        car1.year=2002;
        car1.model="Corolla";
        car1.price=12000.50;
        System.out.println("car 1 brand is \t" + car1.brand);
        System.out.println("car 1 Model is \t" +car1.model);
        System.out.println("car 1 milage is \t " +car1.milage);
        System.out.println("car 1 year is \t" +car1.year);
        System.out.println("car 1 price is \t" +car1.price);
        System.out.println("car 1 color is \t" +car1.color);*/
        car1.setCarInfo("toyata","corolla",2000,"blue",23000,34000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("=======================================================");
        Car car2=new Car();
       /* car2.brand="tesla";
        car2.color="White";
        car2.milage=1200;
        car2.year=2020;*/

        car2.setCarInfo("BMW","X5",2020,"green",1200,23000);

        System.out.println("Car 2 brand is "+ car2.brand);
        System.out.println("Car 2 model is "+ car2.model);
        System.out.println("Car 2 mileage is "+ car2.mileage);
        System.out.println("Car 2 year is "+ car2.year);
        System.out.println("Car 2 price is "+ car2.price);
        System.out.println("Car 2 color is "+ car2.color);


        System.out.println("======================================================");

        Car car3=new Car();
        car3.setCarInfo("audi","A7",2017,"blue",12000,23000);

        Car car4=new Car();
        car4.setCarInfo("Jeep","wrangler",2000,"green",12000,120000);

        car3.getCarInfo();
        car4.getCarInfo();
    }
}
