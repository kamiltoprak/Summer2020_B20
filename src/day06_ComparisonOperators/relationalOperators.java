package day06_ComparisonOperators;

public class relationalOperators {
    public static void main(String[] args) {
        // greater a > and smaller <
        boolean r1=10>9;
        System.out.println(r1);

        boolean r2=100<1000;
        System.out.println(r2);

        // Greater or equal  >=

        boolean r3=87>=85;
        System.out.println(r3);

        boolean r4=877>=878;
        System.out.println(r4);

        // less than or equal <=

        boolean r5=200<=300;
        System.out.println(r5);

        //==
        boolean r6=100==101;
        System.out.println(r6);

        boolean r7=true==false ;
        System.out.println(r7);

        boolean r8="Muhtar"=="bye";
        System.out.println(r8);

        boolean r9="Muhtar"=="Muhtar";
        System.out.println(r9);

        // boolean r10="123"==124; these are not equal  data  type

        boolean r11="Muhtar"!="bad guy";
        System.out.println(r11);

        boolean r12=true!=false;
        System.out.println(r12);

        boolean result='A'==65;
        System.out.println(result);
        boolean result2='A'==65+1+3;
        System.out.println(result2);

        boolean result3=100==100.0;
        System.out.println(result3);

        boolean result4=100==100.1;
        System.out.println(result4);

        boolean result5=100==(int)100.1;
        System.out.println(result5);

        boolean result6= 100==100.9;
        System.out.println(result6);

        boolean result7=0==100%2;
        boolean result8=0!=101%2;
        System.out.println(result7);
        System.out.println(result8);








    }



}
