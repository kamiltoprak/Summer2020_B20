package day19_ForLoop;
//print even number  and odd numbers between 1-50
public class BreakPractices {
    public static void main(String[] args) {
        for(int i=1; i<=50;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+ "");
        }
        System.out.println();
        for(int i=1; i<=50;i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+ "");
        }
    }

}
