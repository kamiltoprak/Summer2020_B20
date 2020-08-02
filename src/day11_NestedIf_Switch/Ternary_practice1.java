package day11_NestedIf_Switch;

public class Ternary_practice1 {
    public static void main(String[] args) {
        int age = 16;
        String citizen = "USA";
        String result = "";
        if (age >= 18 && citizen == "USA") {
            result = "can vote";
        }else{
            result="can not vote";
        }
        System.out.println(result);

        String result2= (age >= 18 && citizen == "USA")? "can vote" : "can not vote";
        System.out.println(result2);
        System.out.println("======================================================");

        int n1=100;
        int n2=200;
        String r = (n1==n2) ? "equal": "not equal";
        System.out.println(r);
        System.out.println("===============================================");

        int num=100;
        String result3="";
        if(num>0){
            result3="positive";
        } else if (num < 0) {
            result3="negative";

        }else {
            result3="Zero";
        }
        System.out.println(result3);
        System.out.println("================================================");
        String result4=(num>0)? "positive" : (num<0)? "nagetive": "zero";
        System.out.println(result4);
    }
}


