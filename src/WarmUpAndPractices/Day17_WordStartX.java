package WarmUpAndPractices;

import java.util.Scanner;

public class Day17_WordStartX {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String word=scan.next();
            if(word.startsWith("x")){
                System.out.println(word.substring(1,word.length()));
            }

        }
    }


