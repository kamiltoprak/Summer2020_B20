package day15_String;



import java.lang.String;
public class String_Intro {
    public static void main(String[] args) {
        String str = "Cybertek";
        //Scanner input=new Scanner(System.in);
        String name="Cybertek";
        String name2=new String("cybertek");

        String s1="Cat";//String Literal
        String s2="Cat"; // String literal one object  shared by two  variables.

        System.out.println(s1==s2);

        String d1= "Dog";//String literal
        String d2="dog";// String literal  two  object becouse they  are not  the same.
        System.out.println(d1==d2);


        String t1=new String("tiger");
        String t2=new String("tiger");
        System.out.println(t1==t2);
        // new String (" tiger") ==  new String ("tiger")


        System.out.println("==========================================================");

        String c1="Cybertek";// string pool
        String c2=new String("Cybertek");// heap
        String c3=new String("Cybertek");// heap
        String c4="Cybertek";// string pool
        String c5="Cybertek";// string pool


        System.out.println( c1==c2);// false
        // Cybertek == new String (" Cybertek")

        System.out.println(c2==c3);//false
        //new String("Cybertek") == new String("Cybertek")

        System.out.println(c2==c4);//false
        // Cybertek == Cybertek

        System.out.println(c4==c5);//true
        // Cybertek == cybertek


        System.out.println("====================================");


        String str1="java";
        str1="Javascript";
        System.out.println(str1);





    }

}
