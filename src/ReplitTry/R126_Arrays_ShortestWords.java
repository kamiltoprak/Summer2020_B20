package ReplitTry;
/*Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings.  Print array with Arrays.toString() method. Sort array before printing.
        Split values by comma: split(", ");
        input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        output: [cat, old, ray]*/
import java.util.*;
public class R126_Arrays_ShortestWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str1=str.split(", ");

        int min=str1[0].length();
        for(String elements:str1){
            if(min>elements.length()){
                min=elements.length();
            }
        }

        String word="";
        for(String elements:str1){
            if(min==elements.length()){
                word+=elements+" ";
            }
        }


        String [] result=word.split(" ");

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

        }
    }

