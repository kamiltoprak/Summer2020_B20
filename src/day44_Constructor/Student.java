package day44_Constructor;

public class Student {

    String name;
    int age;
    String gender;
    static String schoolName="Cybertek University";

    /*public void setInfo(String name,int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }*/

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", School Name: "+schoolName;
    }

    public Student(String name, int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }

    /*public static void main(String[] args) {
        Student name1=new Student("ali",12,"male");
        Student name2=new Student("ala",10,"female");
        Student name3=new Student("Vali",32,"male");

    }*/


}
