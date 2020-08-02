package day19_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i+"");

        }
        System.out.println("======================");
        for(char ch = 'A'; ch<='F'; ch++){
            if(ch=='C') {
                continue;
            }
            System.out.println(ch+" ");

        }
    }
}
