package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(500);
        list.add(323);
        list.add(523);
        list.add(5322);
        list.add(5323);
        list.add(2320);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(Integer each:list){
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
