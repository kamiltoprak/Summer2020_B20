package day39_CustomClass;
/*Dog (sample class):
        instance variables:
        breed ,  size, age, color

        instance methods:
        setDogInfo, getDogInfo, eat, drink sleep*/
public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;

    public String getInfo(String[] args) {
        return ("this is my  dog");
    }

    public  void setDogInfo(String dogName,String dogBreed,String dogSize,int dogAge,String dogColor) {
        name=dogName;
        breed=dogBreed;
        size=dogSize;
        age=dogAge;
        color=dogColor;
    }

    public  void getDogInfo() {
        System.out.println("Name: "+ name+", Breed: "+breed+", Size: "+size+", Color: "+color+ ", Age:  "+age+" years old ");
    }

    public  void eat(String food) {
        System.out.println(name+ " eats  this  food "+ food);

    }

    public  void drink(String drinking) {
        System.out.println(name+ " likes to drink "+ drinking);
    }

    public  void sleep() {
        System.out.println(name + " is sleeping  ");
    }

    public  void play() {
        System.out.println(name + " is playing  ");
    }

}
