package day05_AritmeticOperators;

public class employeeInfo {

        public static void main(String[] args) {
            String firstName= "John";
            String lastName="Mclaren";
            String gender="Male";
            int age=34;
            String companyName="Google";
            String jobTitle="CEO";
            boolean isFullTime=true;
            boolean isMarried=true;
            double salary=120000.50;
            String employeeFullName=firstName+" "+lastName;
            System.out.println("Employee' full name is:"+firstName+" "+lastName);
            System.out.println(employeeFullName+"' gender is:\t\t\t"+gender);
            System.out.println(employeeFullName+"' age is:\t\t\t\t"+age);
            System.out.println(employeeFullName+" works at:\t\t\t\t"+companyName);
            System.out.println(employeeFullName+"' Job title is:\t\t\t"+jobTitle);
            System.out.println(employeeFullName+"' salary is $\t\t\t"+salary);
            System.out.println(employeeFullName+" is full time employee:\t"+isFullTime);
            System.out.println(employeeFullName+" is full time employee:\t"+isMarried);
        }
    }
