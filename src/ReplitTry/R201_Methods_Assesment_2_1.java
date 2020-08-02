package ReplitTry;

import java.util.Arrays;

public class R201_Methods_Assesment_2_1 {
    public static void main(String[] args) {
        String sentence="I would like to buy a new laptop, because my laptop is too old.";
        String target="laptop";
        int count=0;
        String[] str=sentence.split(" ");
        System.out.println(Arrays.toString(str));
        for(String element:str){
            if(element.equalsIgnoreCase(target)){
                count++;
            }

        }
        System.out.println(count);
        if(count==2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
