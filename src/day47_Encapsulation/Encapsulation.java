package day47_Encapsulation;

public class Encapsulation {

    private long ssn=123233456;


    public long getSsn(){ //read only
        return ssn;
    }


    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
}
