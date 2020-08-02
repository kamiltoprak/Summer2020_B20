package day29_CustomMethods;

public class ReturnKeyword {
    public static void main(String[] args) {
        grade(132);
        System.out.println("task completed");
    }

    public static void grade(int numbers) {
        if(numbers<0 || numbers>100){
            System.out.println("invalid score");
            return;
            //System.exit(0);
        }
        char grade=(numbers>=90)?  'A':(numbers>=80)? 'B':(numbers>=70)? 'C':(numbers>=60)? 'D':'C';
        System.out.println("Grade is: "+grade);
    }
}
