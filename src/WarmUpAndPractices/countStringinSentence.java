package WarmUpAndPractices;

public class countStringinSentence {
        public static int countString(String str, String toFind)
        {
            int count=0;
            for (int i=0; i<=str.length()-1;i++){
                if(str.contains(toFind)){
                    str=str.replaceFirst(toFind,"");
                    count++;
                }
            }
            return count;
        }

        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(countString("crazy crayfish crushing craniums", "cra")); //3
            System.out.println(countString("sometimes solutions dont come on time", "me")); //4
        }
}

