package day19_ForLoop;

public class Characters_A_Z {
    public static void main(String[] args) {
        for (char lovercase='a'; lovercase<='z'; lovercase++ ){
            System.out.print(lovercase);
        }
        System.out.println();
        for (char uppercase='A'; uppercase<='Z'; uppercase++ ){
            System.out.print(uppercase);

        }
        System.out.println();
        for (int i=97; i<=122; i++){
            System.out.print((char)i+" ");

        }
        System.out.println();
        for (int i='a'; i<='z'; i++){
            System.out.print((char)i+" ");

        }

        System.out.println();
        for (int i='A'; i<='Z'; i++){
            System.out.print((char)i+" ");

        }
        System.out.println();
        for (int i=65; i<=90; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();

        for (int i=122; i>=97; i--){
            System.out.print((char)i+" ");

        }
        System.out.println();
        for (int i='z'; i>='a'; i--){
            System.out.print((char)i+" ");

        }

        System.out.println();
        for (int i='Z'; i>='A'; i--){
            System.out.print((char)i+" ");

        }
        System.out.println();
        for (int i=90; i>=65; i--){
            System.out.print((char)i+" ");
        }
        System.out.println();

    }
}
