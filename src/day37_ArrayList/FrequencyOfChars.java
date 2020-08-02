package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AABBCDDEF";
        ArrayList<String> list = new ArrayList<>();
        for (String each : str.split("")) {
            list.add(each);
        }
        System.out.println(list);
        String str1="";
        for (String each : list) {
            //for (int i = 0; i <list.size() ; i++) {
            int count = Collections.frequency(list, each);
            if(!str1.contains(each)){
                str1+=each+count;
            }
        }
        System.out.println(str1);
    }

}
