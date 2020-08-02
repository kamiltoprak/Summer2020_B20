package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //String str="aabbkllllkkktttkkkgggjjhhgglkkkkklll"; //ab
        String str=scan.nextLine();
        String result="";
        for(int i=0;i<=str.length()-1;i++){
            String s=str.substring(i,i+1);//aabb
            if(!result.contains(s)){
                result+=s;
            }
          /*  if(result.contains(s)){
                continue;

            }
            result+=s;*/

        }
        System.out.println(result);


    }
}
