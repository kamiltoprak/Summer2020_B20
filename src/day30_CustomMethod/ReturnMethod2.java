package day30_CustomMethod;

public class ReturnMethod2 {
    public static void main(String[] args) {
        String name="kamil";
            System.out.println(name.equalsIgnoreCase( revStr1(name) ));
    }

    public static String revStr1(String str) {
        String result="";
        for (int i=str.length()-1 ; i>=0;i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}
