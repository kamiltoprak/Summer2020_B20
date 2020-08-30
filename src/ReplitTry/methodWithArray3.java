package ReplitTry;

import java.util.ArrayList;
import java.util.Collections;

public class methodWithArray3 {
    public static void main(String[] args) {
        String[] r={"A","A","B","C","T","F","4","F","A"};
        int a=getDup(r);
        System.out.println(a);
    }

    public static int getDup(String[] r) {
        ArrayList<String> str=new ArrayList<>();
        for(String each:r){
            str.add(each);
        }
        int totalcount=0;
        int count=0;
        for (int i = 0; i <str.size() ; i++) {
            count= Collections.frequency(str,str.get(i));
            if(count>1){
                totalcount++;
            }
            count=0;
        }
        return totalcount;

    }

}

