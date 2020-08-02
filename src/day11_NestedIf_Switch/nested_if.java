package day11_NestedIf_Switch;

public class nested_if {
    public static void main(String[] args) {
        /*
        90 ~ 100 ==> A
80 ~ 89 ==> B
70 ~ 79 ==> C
60 ~ 69 ==> D
otherwise ==> F
other => invalid

         */

        int score = 0;
        String result = "";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }

        } else {
            result = "invalid";
        }
        System.out.println(result);
        System.out.println("============================================================================");

        /*
        precondition loan :  min salary is 30K
        job history :  2 years

         1 monday
         2 tuesdya
         .
         .
         .
         7 sunday
         invalid : there is not  such a day



         */

        double salary = 45000;
        double experience = 3;
        String result2 = "";
        if (salary > 30000) {
            if (experience >= 2) {
                result2 = "your are eligible";
            } else {
                result2 = " you  are not  eligible,  you needto  have at least  2 year  experiences";
            }
        } else {
            result2 = "you  are not elegible, you need to  make at least 30K";

        }
        System.out.println(result2);
        System.out.println("============================================================================");

        int dayNumber = 2;
        String result3 = "";
        if (dayNumber >= 1 && dayNumber <= 7) {
            if (dayNumber == 7) {
                result3 = "Sunday";
            } else if (dayNumber == 6) {
                result3 = "Saturday";
            } else if (dayNumber == 5) {
                result3 = "Friday";
            } else if (dayNumber == 4) {
                result3 = "thursday";
            } else if (dayNumber == 3) {
                result3 = "wednesday";
            } else if (dayNumber == 2) {
                result3 = "Tuesday";
            } else {
                result3 = "monday";
            }
        } else {
            result3 = " invalid entry";
        }
        System.out.println(result3);

        int day1 = 3;
        String result4 = "";
        if (day1 >= 1 && day1 <= 7) {
            result4 = (day1 == 7) ? "Sunday" : (day1 == 6) ? "Saturday" : (day1 == 5) ? "Friday" : (day1 == 4) ? "thursday" : (day1 == 3) ? "Wednesday" : (day1 == 2) ? "Tuesday" : "Monday";


        } else {
            result4 = "invalid entry";
        }
        System.out.println(result4);
    }
}

