package WarmUpAndPractices;

public class replace {
        public static String spaceOut(String s)
        {
            String a=s.replace(""," ");
            a=a.trim();
            return a;

        }

        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(spaceOut("hello")); //"h e l l o "
            System.out.println(spaceOut("technology")); //"t e c h n o l o g y "
        }
}
