package WarmUpAndPractices;
/*Write a program that can return the longest string of text from a String array
Write a program that can return the shortest string of text from a String array*/
public class day24_LongestAndShortestString {
    public static void main(String[] args) {
        String[] words={"alat","ali","veli","yakup","mehmeti","al","alaatini"};
        String a="";

        for (int i = 0; i <words.length ; i++) {
           if(a.length()<words[i].length()){
               a=words[i];
           }
        }
        String b=a;
        for (int i = 0; i <words.length ; i++) {
            if(b.length()-words[i].length()>0){
                b=words[i];
            }
        }

        System.out.println("Longest String is "+a);
        System.out.println("Longest String is "+b);
    }
}
