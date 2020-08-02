package day31_Recap;
/*1.  write a return method called frequency that accepts two parameters:
string str and char ch, the method returns the frequency of the ch from the str as an int
        Ex:
        frequency("AAA", 'A') ==>  3
        frequency("ABAB", 'B') ==> 2
        Note: MUST use Arrays and for each loop
        please copy paste the method to the util class*/

public class WarmupTask {
    public static void main(String[] args) {
        String str="aaabbddccffgthaddsdsldsdsdsdssdfdsfdfsdf";
        String unique="";

        for (char each:str.toCharArray()) {

            int count =frequence(str,each);
            if(count==1){
                unique+=each;
            }
        }
        System.out.println(unique);
        System.out.println("==========================================");
        String  str2="fdsfdsfdsgsdfnsfdsfdsfdsfdsfasfewre";
        String  unique2=unique(str2);
        System.out.println(unique2);
    }

    public static int frequence(String str,char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if(each==ch){
                count++;
            }
        }
        return count;
    }
    public static String unique(String str){
        String unique="";

        for (char each:str.toCharArray()) {

            int count =frequence(str,each);
            if(count==1){
                unique+=each;
            }
        }
        return unique;

    }




}
