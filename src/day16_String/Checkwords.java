package day16_String;
 /*4. write a method that asks user to enter a string.
         if the string is empty, print: string is empty
         if the string has more than 3 characters, print the last three characters
         if the string has less than 3 characters, print the string itself
         4. Write a program  for CheckWords:
         Program accepts 3 words and :
         - if they are same length:      print "All words are same length"
         - if some same length and others not:    print "Not Same nor Different lengths"
         - if all different length :  print "All different length"

  */
public class Checkwords {
    public static void main(String[] args) {
        String str="I like java";
        if (str.length()>0){
            if (str.length()>3){
                System.out.println(str.substring(str.length()-3));
            }else{
                System.out.println(str);
            }
        }else{
            System.out.println("string is empty");

        }

        String result=(str.length()==0)?"empty String" :
                (str.length()>3)?str.substring(str.length()-3):str;

        System.out.println("result");
        System.out.println("=============================================================");
        String str1="abcd";
        String str2="ab";
        String str3="abc";
        boolean allSame=str.length()==str2.length() && str2.length()==str3.length();
        boolean allDifferent=str1.length()!=str2.length() && str2.length()!=str3.length() && str3.length()!=str1.length();
        String result1="";
        if(allSame){
            result1="All words are same length";
        }else if (allDifferent) {
            result1 = "All different length";
        }else{
            result1="Not Same nor Different lengths";
;        }
        System.out.println(result1);

    }
}
