package day39_CustomClass;
/*	AmployeeNAme, Gender, SSN, EmployeeID,JobTitle, Salary

            Action:
            AttendMeeting, Working, GetInfo,Setinfo

            ArrayList of EMployee
            1- remove all  the employee  who  are   making less than  100K
            2- Remove all the QAs*/
public class Employee {
    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;

    public  void setEmployeeInfo(String employeeName,char employeeGender,String employeeSSN,String employeeJobTitle,double employeeSalary) {
        name=employeeName;
        gender=employeeGender;
        SSN=employeeSSN;
        jobTitle=employeeJobTitle;
        salary=employeeSalary;

    }

    public  void getEmployeeInfo() {
        System.out.println("Employee name: "+name+" Employee Gender: "+gender+" Employee JobTitle: "+jobTitle+" Employee salary: "+salary);
        System.out.println("last 4  digit of SSN "+SSN.substring(SSN.length()-4));
    }

}
