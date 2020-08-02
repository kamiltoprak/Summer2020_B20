package day04_boolean_char;
/*

Employeee name
employee Id
Job title
salary
gender (char )
 */
public class variables4 {
    public static void main(String[] args) {
        String name="Dany";
        int ID=103204;
        String employeeLocalID="1232rt";
        String jobTitle="COO";
        double salary=100_000.58;
        char gender='F';
        boolean isFullTime=true;
        boolean targetSalary=120_000<=salary;
        System.out.println("Employee Name:          "+name);
        System.out.println("Employee ID:            "+ID);
        System.out.println("Employee Job:           "+jobTitle);
        System.out.println("Employee Salary         "+salary);
        System.out.println("Employee Gender:        "+gender);
        System.out.println("IS  employee FullTime:  "+isFullTime);
        System.out.println("Is  drwam  salary:      "+targetSalary+"  USD");
    }
}
