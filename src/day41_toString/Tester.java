package day41_toString;

class TesterObjects{
    public static void main(String[] args) {


        Tester[] Testers = {new Tester(), new Tester(), new Tester(), new Tester(), new Tester()};


        Testers[0].setInfo("Aalia", 150000, "Female", 18);
        Testers[1].setInfo("Naz", 150000, "Female", 18);
        Testers[2].setInfo("Kalbinur",  155000, "Female",  21);
        Testers[3].setInfo("Rakhat", 130000, "Female", 28);
        Testers[4].setInfo("Edward", 110000, "Male", 30);

        for (Tester each:Testers) {
            System.out.println(each);
        }







    }
}


public class Tester {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender,int age){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.gender=gender;
    }

    public String toString(){
        return "Name: "+name+" Gender: "+gender+" Age: "+age+" Salary: "+salary;
    }
}



