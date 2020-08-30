package day29_CustomMethods;

public class Grade {

    public static void main(String[] args) {
        grade(89);
    }

    public static void grade(int numbers) {
        char grade=(numbers>=90)?  'A':(numbers>=80)? 'B':(numbers>=70)? 'C':(numbers>=60)? 'D':'C';
        System.out.println(""+grade);
    }
}

