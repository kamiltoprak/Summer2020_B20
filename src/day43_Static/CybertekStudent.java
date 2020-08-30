package day43_Static;

public class CybertekStudent {
    // for the advantage of static
    String studentName;
    int age;
    char gender;
    static String schoolName="Cybertek School";

public void getInfo(){
    System.out.println("name: "+ studentName);
}
    public void printSchoolName(){

        System.out.println("school NAme:"+ schoolName );

    }

}
class A{
    static int a=200;
}