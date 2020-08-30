package WarmUpAndPractices.day44;
import java.util.ArrayList;
import java.util.Arrays;
public class SalaryObjects {
    public static void main(String[] args) {
        SalaryCalculator job1 = new SalaryCalculator(65,40,0.625,0.22);
        SalaryCalculator job2 = new SalaryCalculator(75,40,0.625,0.22);
        SalaryCalculator job3 = new SalaryCalculator(55,40,0.625,0.22);
        SalaryCalculator job4 = new SalaryCalculator(85,40,0.625,0.22);
        SalaryCalculator job5 = new SalaryCalculator(95,40,0.625,0.22);

        ArrayList <SalaryCalculator> list = new ArrayList<>();
        list.addAll(Arrays.asList(job1,job2,job3,job4,job5));
        for( SalaryCalculator each : list){
            System.out.println(each);
        }

    }
}
