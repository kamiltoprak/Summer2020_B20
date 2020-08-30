package day41_toString;

public class Developer {
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


    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBugs(){
        System.out.println(name+" is crying");
    }

    public String toString(){
        return "Name: "+name+" Gender: "+gender+" Age: "+age+" Salary: "+salary;
    }
}
class developerObjects{
    public static void main(String[] args) {
        Developer[]  developers={new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("Ahmet",120000,"male",36);
        developers[1].setInfo("Hamid",110000,"Male",20);
        developers[2].setInfo("AliKemal",125000,"Male",25);
        developers[3].setInfo("Sofiya",110000,"Female",26);
        developers[4].setInfo("Aydan",112500,"Femal",33);

        for(Developer each:developers){
            System.out.println(each);
            each.coding();
        }
        //System.out.println(developers[0]);
        System.out.println("========================================================");
        for (int i = 0; i < developers.length; i++) {
                developers[i].fixBugs();
        }


    }
}