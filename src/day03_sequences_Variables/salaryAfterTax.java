package day03_sequences_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class salaryAfterTax {
    public static void main(String[] args) {


        // Salary  and tax end salary after tax
        int salary = 100000;
        double tax = 0.07;
        double ttax = salary * tax;
        double nets = salary - ttax;
        System.out.println(nets);

    }
}
