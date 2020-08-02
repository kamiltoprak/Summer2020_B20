package day29_CustomMethods;
/*
Step1:  print hello  5 times
Step2 : print school  name
Step3 : print hello  5 times
step4 : print your nme
step5 : print hello 5 times
 */
public class methodWithoutParameter2 {
    /*
    * access modifier specifier return-type  name(){
    *           statement
    * }
    * */
    public static void main(String[] args) {
        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("Muhtar");
        printHello5X();

    }



    public static void printHello5X(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");
        }

    }




}
