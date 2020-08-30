package OfficeHours.Practices_06_30_2020;
public class LetterGrading {
        public static void main(String[] args) {
            int score=80;
            int grade=' ';
            if (score>60){
                if(score>=90){
                    grade='A';
                }else if(score>=80){
                    grade='B';
                }else if(score>=70){
                    grade='C';
                }else{
                    grade='D';
                }
            }else{
                grade='F';
            }
            System.out.println(grade);
            char grade1=(score>=90 && score<=100)? 'A':(score>=80 && score<=89)? 'B':(score>=70 && score<=79)? 'C':(score>=60 && score<=69)? 'D':'F';
            System.out.println(grade1);

        }
    }


