package day19_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for(char ch='A'; ch <= 'H'; ch++) {
            if(ch=='C'){
                break;
            }
            System.out.println(ch+" ");
        }
        System.out.println("====================");
        for(int i=10; i <=50; i+=10){
            if(i>30){
                break;
            }
            System.out.print(i+" ");
            if(i==30){
                break;
            }

        }
        System.out.println();
        System.out.println("==============================");
        for(int X=1000; X>=100; X-=100){
            if(X==500){
                break;
            }
            System.out.print(X+" ");

        }

    }
}
