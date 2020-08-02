package Java_Interview;
/*Write a return metod that can remove the duplicated values from String.
        (biz daha method’lari islemedigimiz icin soruyu soyle ceviriyoruz:
        Write a program that can remove the duplicated values from String)*/
import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String a = "";
        for (int i = 0; i < word.length(); i++) {
            String newWord = word.substring(i, i + 1);
            if (!a.contains(newWord)) {
                a += newWord;
            }
        }
        System.out.println(a);
    }
}
