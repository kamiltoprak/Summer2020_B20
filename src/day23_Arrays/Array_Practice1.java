package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
        //String students="muhtar", "NAdir", "Asiya"
        String[] frinds = new String[10];
        String[] students = {"student1", "student2", "student3", "student4", "student5"};
        //                  0             1       2           3           4
        String name1 = students[4];
        System.out.println(name1);
        System.out.println("=================");
        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};
        //                 0       1    2       3       4
        int[] grades = {85, 70, 95, 90, 100};
        //             0  1  2  3   4

        System.out.println(names[0] + " : " + grades[0]);
        System.out.println(names[1] + " : " + grades[1]);
        System.out.println(names[2] + " : " + grades[2]);
        System.out.println(names[3] + " : " + grades[3]);
        System.out.println(names[4] + " : " + grades[4]);
        System.out.println("=======================================");
        for (int i = 0; i <=4 ; i++) {
            System.out.println(names[i] + "\t : " + grades[i]);
        }

        System.out.println("============================================");

        String[] classMates=new String[5]; //size is 5
        classMates[0]="Fatih";
        classMates[2]="Hazel";
        classMates[1]="Viorel";
        classMates[3]="Elkem";
        classMates[4]="Ahmed";
        //classMates[5]="mehmed";
        for (int i = 0; i <classMates.length ; i++) {
            System.out.println(classMates[i]);
        }





    }
}
