package day37_ArrayList;
/* 1. write a program that can find the unique characters from a string
         DO NOT use nested loop
         "ABABCDEE"
         output: C D
         2. write a program that can find the frequency of character from a String
         DO NOT use nested loop
         "AABBCCDDEE"  ==> "ABCDE"
         output: A2B2C2D2E2*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str="AABBCDDEF";
        ArrayList<String> list=new ArrayList<>();
        for(String each:str.split("")){
            list.add(each);
        }
        System.out.println(list);
        for (String each:list){
        //for (int i = 0; i <list.size() ; i++) {
            int count= Collections.frequency(list,each);
            if(count==1){
                System.out.print(each);
            }
        }

    }
}
