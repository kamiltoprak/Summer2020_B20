package day34_WrapperClasses;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str="123";
        int a= Integer.parseInt(str); // 123  it is converting from  string to  primitive ;

        System.out.println(str+1);// string 123+1 = 1231
        System.out.println(a+1); // integer 123+1 = 124

        Double d1=Double.parseDouble("7.5"); //  parse  always  convert  to  premitive value
        System.out.println(d1-1);

        boolean b1=Boolean.parseBoolean("true");

        System.out.println(!b1);


        System.out.println("====================================");

        String s2="10000.5";
        double d2=Double.valueOf(s2); // unboxing
        System.out.println(d2*2);
        System.out.println("====================================");


        String s3="FalSe";
        boolean b2=Boolean.valueOf(s3); // unboxing

        System.out.println(b2);




    }
}
