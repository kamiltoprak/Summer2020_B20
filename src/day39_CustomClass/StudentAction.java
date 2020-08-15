package day39_CustomClass;

public class StudentAction {
    public static void main(String[] args) {


        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student1.setStudentInfo("ali",12,'m',"RX123");
        student2.setStudentInfo("veli",12,'m',"GT321");
        student3.setStudentInfo("ayse",16,'f',"TY456");
        student4.setStudentInfo("serpil",14,'f',"TR234");

        student1.getStudentInfo();
        student2.getStudentInfo();
        student3.getStudentInfo();
        student4.getStudentInfo();

        Student[] students = {new Student(),new Student(),new Student(),new Student()};

        students[0].setStudentInfo("vali",22,'m',"TRX123");
        students[1].setStudentInfo("mali",32,'f',"TRX153");
        students[2].setStudentInfo("tali",42,'m',"TRX163");
        students[3].setStudentInfo("rali",52,'m',"TRX143");

        for (Student each:students) {
            each.getStudentInfo();
        }
        System.out.println("====================================");
        //  study  5 hours
        int studyHours=5;
        for (Student each:students) {
            each.study(studyHours);

        }
        //  study  5 hours
        int sleepHours=7;
        for (Student each:students) {
            each.sleep(sleepHours);

        }
    }
}
