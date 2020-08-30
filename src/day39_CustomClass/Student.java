package day39_CustomClass;

public class Student {
    String name;
    int age;
    char gender;
    String ID;



    public  void setStudentInfo(String sName,int sAge, char sGender,String sID) {
        name=sName;
        age=sAge;
        gender=sGender;
        ID=sID;

    }

    public  void getStudentInfo() {
        System.out.println(name+" "+age+ " "+gender+ " "+ID);
    }
    public  void study(int studyHours) {
        System.out.println(name+ " is  studying "+ studyHours);

    }
    public  void sleep(int sleepHours) {
        System.out.println(name+ " is  sleeping "+ sleepHours);

    }


}
