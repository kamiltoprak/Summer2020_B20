package Slacks;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST {
    public static void main(String[] args) {
        ArrayList<Integer>  numlist=new ArrayList<>();
        numlist.addAll(Arrays.asList(1,2,3,4,5,6,7));
        Integer a=1;
        numlist.remove(a);

        System.out.println(numlist);
    }
}
