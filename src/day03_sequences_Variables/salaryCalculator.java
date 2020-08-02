package day03_sequences_Variables;
// Salary 100000  tax 0.28
public class salaryCalculator {
    public static void main(String[] args) {
        int salary=150000;
        double tax=0.28;
        double taxtotal=salary*tax;
        double netsalary=salary-taxtotal;
        System.out.println(netsalary);


        System.out.println();
    }
}
