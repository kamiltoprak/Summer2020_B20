package day29_CustomMethods;
//done 	10. write a method that can remeove the duplicates from the string

public class RemoveDuplicates {
    public static void main(String[] args) {
            String str="ddsdfdsfdsfkfsdkfdskfkdsfdsf";
        removeDup(str);
    }

    public static void removeDup(String str) { //abab
        String nonDup=""; //ab
        for (String each:str.split("")) {
            if(!nonDup.contains(each)){
                nonDup+=each;
            }

        }
        System.out.println(nonDup);


    }
}
