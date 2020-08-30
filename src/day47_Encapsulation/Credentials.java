package day47_Encapsulation;
/*	1- creat class credentials
		instance variables:
public name
public age
private username
private password

        getter  and setter

        add a  constructor  to  set name and age*/
public class Credentials {

    public String name;
    public int age;

    private String userName;
    private String passWord;

    public static String companyName;

    static {
        companyName = "FaceBook";
    }

    public Credentials(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return passWord;


    }
}
