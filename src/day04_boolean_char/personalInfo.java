package day04_boolean_char;

/*
ssn
gender
first name
lastname
age
country
married boolen
is employeed
 */
public class personalInfo {

    public static void main(String[] args) {
        String SSN="222-22-2343";
        char  gender='M';
        String firstName="Andy";
        String lastName="Many";
        int age=54;
        String county="Spain";
        boolean isMarried=true;
        boolean isEmployee=true;
        System.out.println("Employee SSN:          "+SSN);
        System.out.println("Employee Gender:        "+gender);
        System.out.println("Employee First Name :   "+firstName);
        System.out.println("Employee Last Name:     "+lastName);
        System.out.println("Employee Age:           "+age);
        System.out.println("Employee Country:       "+county);
        System.out.println("IsemployeeMarried:      "+isMarried);
        System.out.println("IsemployeeMarried:      "+isEmployee);
    }

}
