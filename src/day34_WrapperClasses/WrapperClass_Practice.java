package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Integer[] arr2={1,2,3,4};

        for(Integer each:arr2){ //for( int...  it ill  work  becouse implicitively working
            System.out.println(each);
        }


        double[] arr3={1,2,3,4,5,6,7,}; // primitive   does not  care what we assign
        System.out.println(Arrays.toString(arr3));
        // Double[] arr4={1,2,3,4,5,6,7,}; // wrapper  class accept  own  primitive class  object

       // Double y1=4; // wrapper class  are dedicate own  primitive
        Double[] arr4={1.0,2.0,3.0,4.0,5.0,6.0,7.0,};

        for(double each:arr4){
            System.out.print(each+" ");
        }

        System.out.println();
        char[] arr5={65,67,68,69};
        System.out.println(Arrays.toString(arr5));

        char ch=65;
        Character ch2=65;
        System.out.println(ch);
        System.out.println(ch2);


    }
}
