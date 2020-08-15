package WarmUpAndPractices;

public class alphatic {
        public static String alphabetical(String str)
        {
            String a="";
            char  ch=str.charAt(0);
            a+=ch;
            for(int i=0; i<str.length();i++){
                if(str.charAt(i)>ch){
                    ch=str.charAt(i);
                    a+=ch;
                }
            }
            return a;
        }

        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(alphabetical("adatplqzh")); //"adtz"
        }
    }

