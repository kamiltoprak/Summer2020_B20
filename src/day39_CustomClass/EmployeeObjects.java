package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();
        Employee employee6=new Employee();

        /*employee1.getEmployeeInfo();
        employee2.getEmployeeInfo();
        employee3.getEmployeeInfo();
        employee4.getEmployeeInfo();
        employee5.getEmployeeInfo();
        employee6.getEmployeeInfo();*/

        System.out.println("========================================================================");
        employee1.setEmployeeInfo("Roman",'M',"123231234","QA",120000 );
        employee2.setEmployeeInfo("Jo",'M',"123127659","QA",80000 );
        employee3.setEmployeeInfo("Mike",'M',"239235678","QA",120000 );
        employee4.setEmployeeInfo("Jen",'F',"123232345","SDET",140000 );
        employee5.setEmployeeInfo("Jona",'F',"123232347","SDET",130000 );
        employee6.setEmployeeInfo("Virgin",'F',"123234325","BA",145000.80 );

            employee1.getEmployeeInfo();
            employee2.getEmployeeInfo();
            employee3.getEmployeeInfo();
            employee4.getEmployeeInfo();
            employee5.getEmployeeInfo();
        System.out.println("==================================================");
        ArrayList<Employee> employeeList= new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));

        for (Employee each:employeeList) {
            each.getEmployeeInfo();
        }
        double max = Integer.MIN_VALUE;
        String name = "";
        for( Employee each : employeeList ){
            double eachSalary = each.salary;
            if(eachSalary > max){
                max =  eachSalary;
                name = each.name;
            }

        }

        System.out.println("Maximum Salary: "+max);
        System.out.println("Name: "+name);
        //employeeList.removeIf( each -> each.salary > 135000 );
        //employeeList.removeIf( each -> each.jobTitle.equals("QA") );
        // employeeList.removeIf( each -> each.name.toLowerCase().contains("m") );
        employeeList.removeIf( each -> each.name.charAt(0) == 'R' );
        for( Employee each: employeeList){
            // each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }

    }
}
