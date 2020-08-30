package day36_ArrayList;

import java.util.ArrayList;

public class Set_Method {

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10); // 0
        list1.add(20); //1
        list1.add(30); //2
        list1.add(40); //3
        list1.add(50); // 4
        list1.add(60); // 5
        list1.add(70);  //6
        list1.add(80);  //7

        list1.set(list1.size()-1,0);
        System.out.println(list1);


        System.out.println("========================");

        ArrayList<Integer> list2=new ArrayList<>();
        for (int i = 0; i <21 ; i++) {
            list2.add(i);
        }

        System.out.println(list2);


        for (int i = 0; i <21 ; i++) {
           Integer each=list2.get(i);
            if(each%2!=0){
                list2.set(i, each*2);
            }else{
                list2.set(i,each*3);
            }
        }
        System.out.println(list2);
    }
}
