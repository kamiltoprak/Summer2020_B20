package ReplitTry;
import java.util.Scanner;
public class DOgCAt {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int countOfCats = 0;
            int countOfDogs = 0;
            String word = scan.next();
            System.out.println(word);
            for(int i=0; i<=word.length()-1; i++){
                if(word.contains("cat")){
                    countOfCats++;
                    System.out.println("cat "+countOfCats);
                    word=word.replaceFirst("cat","");
                    
                }
                if(word.contains("dog")){
                    countOfDogs++;
                    System.out.println("dog "+countOfDogs);
                    word=word.replaceFirst("dog","");
                }

            }
            if(countOfDogs==countOfCats){
                System.out.println("true");
            }else{
                System.out.println("false");
            }




        }
    }

