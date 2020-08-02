package WarmUpAndPractices;
import java.util.*;
public class day26_Testing {
    public static void main(String[] args) {
        int wd=0;
        String[] array={"s","m","w","Sa"};
        for (int i = 0; i <array.length ; i++) {
                switch (array[i]){
                    case"Sa":
                    case"s":
                        wd-=1;
                        break;
                    case "m":
                        wd++;
                    case"w":
                        wd+=2;

                }

        }
        System.out.println(wd);

    }
}
