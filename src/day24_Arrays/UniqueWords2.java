package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {
        String[] words={"C#","C#","JAVA","Python","Python","C++"};
        for (int i = 0; i <words.length ; i++) {
            String s=words[i];
            int count=0;
            for(String b:words){//b represent  each  elements in the array
                if(s.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s);
            }
        }
    }
}
