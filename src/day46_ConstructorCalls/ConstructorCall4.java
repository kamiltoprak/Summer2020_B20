package day46_ConstructorCalls;

public class ConstructorCall4 {
    public ConstructorCall4(){
    }
    public ConstructorCall4(int a){
        this(2.5);

    }
    public ConstructorCall4(double a){
        this();
    }

}
