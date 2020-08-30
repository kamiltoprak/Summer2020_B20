package day47_Encapsulation;

public class MyCredential {
    public static void main(String[] args) {
        Credentials obj=new Credentials("Ahmet",21);
        obj.setPassword("233423");
        obj.setUsername("ahmetdsds");


        System.out.println(obj.getPassword());
        System.out.println(obj.getUsername());

        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.companyName);

    }
}
