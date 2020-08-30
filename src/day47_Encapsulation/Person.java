package day47_Encapsulation;
/*name
age
gender
dateof birth
private ssn
private ID
privvate  address*/

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;

    private Long  ssn;
    private String ID;
    private String  address;


    public Person(String name, int age, char gender, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", ssn=" + ssn +
                ", ID='" + ID + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
