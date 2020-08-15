package WarmUpAndPractices;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums=new ArrayList<>();
        int run=in.nextInt();
        while(run>0){
            run--;
            switch (in.nextInt()){
                case 1:
                    nums.add(1);
                case 5:
                    nums.add(50);
                    break;
                case 4:
                    break;
                case 8:
                    nums.remove(0);
                    break;
                case 10:
                case -1:
                case -42:
                    nums.add(1,0);
                    break;
                case 55:
                    nums.add(105);
                    break;
                case 2:
                    nums.add(20000);
                    break;
                default:
                    nums.add(null);
            }
        }
        System.out.println(nums);

    }
}
