package WarmUpAndPractices;

public class day17_count {
        public static void main(String[] args) {

            String str3="AAAABBBBCCCCCD";
            String word="";
            for (int i=0; i<str3.length();i++){
                if(str3.charAt(i)!=str3.charAt(i+1)){
                    word+=str3.charAt(i+1);
                }
            }

            System.out.println(word);
        }

    }

