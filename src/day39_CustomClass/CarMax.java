package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        Car car5=new Car();

        car1.setCarInfo("lexus","RX350",2020,"White",12000,100000);
        car2.setCarInfo("lexus","UX",2018,"black",1000,50000);
        car3.setCarInfo("lexus","NX",2017,"green",2000,30000);
        car4.setCarInfo("lexus","GX",2019,"blue",3000,25000);
        car5.setCarInfo("lexus","LX",2000,"bej",40000,50000);

        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();

        car1.carStart();
        car2.carStart();
    }
}
