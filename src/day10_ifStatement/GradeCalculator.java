package day10_ifStatement;
import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        int score=scans.nextInt();
        String grade="";
        if (score>=90 && score<=100){
            grade="A";
        }else if(score>=80 && score<90){
            grade="B";
        }else if(score>=70 && score<80){
            grade="C";
        }else if(score>=60 && score<70){
            grade="D";
        }else if (score>=0 && score<60){
            grade="F";
        }else {
            grade="invalid score";
        }
        System.out.println("Your student's final grade is "+grade);

    }
}
