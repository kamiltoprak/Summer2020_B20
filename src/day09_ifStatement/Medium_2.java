package day09_ifStatement;

public class Medium_2 {
    public static void main(String[] args) {
            double a=100;
            double b=200;
            double c=300;
            boolean aIsMed =  a < b   &&  a > c || a > b && a < c ;
            boolean bIsMed =  b < a   &&  b > c || b > a && c > b ;
            boolean cIsMed =  aIsMed == false  &&  bIsMed == false  ;

            double med=0;
            if(aIsMed){
                med = a ;
            }
            if(bIsMed){
                med  = b;
            }
            if(cIsMed){
                med = c;
            }
            System.out.println(med +" is medium number");
        }
    }

