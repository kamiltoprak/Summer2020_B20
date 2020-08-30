package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1=100;
        long l1=s1; // implicit csasting: automatically is done
        long l2=(long)s1;
        int I1=300;
        double D1=I1;
        double D2=(double)I1;

        System.out.println("===============================");

        double d1=40333.908;
        int i3=(int)d1;
        System.out.println(i3);

        int num4=400;
        byte gt6=(byte)num4;
        System.out.println(gt6);

        double t=1432432523554355435.43;
        int num6=(int)t;
        System.out.println(num6);


        double n1=34.5;
        float f1=(float)n1;
        System.out.println("===============");
        System.out.println(f1);
        long l33=(long)n1;
        System.out.println(l33);
        float f2=(int)n1;
        System.out.println(f2);

        System.out.println("=======================");
        long r1=-500;
        int fg1=(short)r1;
        System.out.println(fg1);

        long gf45=12;
        byte fg45=(byte)gf45;






    }


}


