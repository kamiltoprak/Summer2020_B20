package day39_CustomClass;

public class Car {
    // attributes : model, brand , year, color, milage, price.....
    //String model="teasla";
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void  setCarInfo(String carBrand,String carModel,int carYear,String carColor, double carMileage,double carPrice) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;

    }
    // sets  the info of the car objects

    public void getCarInfo(){
        System.out.println(year+", "+brand+", "+model+", "+color +", "+mileage+" "+price);

    }
    // 2012 Toyota Corolla Red 10000 $ 45000

    public void carStart(){
        System.out.println(brand+" "+model+" is started" );
    }

}
