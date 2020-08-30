package Slacks;

import java.util.Scanner;

public class pullnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your  words");
        String str=scan.next();
        char[] str1=str.toCharArray();
        String result="";
        for(char each:str1){
            if(each<='9' && each>='0' ){
                result+=each;
            }
        }
        System.out.println(result);
    }
}
