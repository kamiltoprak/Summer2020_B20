package ReplitTry;
/*Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.

        Examples:
        Main.appearsTwice("java", "java is fun!")
        - returns false, because java appears only once.

        Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
        - returns true, because laptop appears twice.*/
public class R202_Methods_AssessmentTest2_1_Appearstwice {

        public static void main(String[] args) {
            System.out.println("Hello world!");
        }

        /**
         *target - string that you need to check.
         * sentence - string where you need to lookup for target.
         *
         */
        public static boolean appearsTwice(String target, String sentence) {
            //write your codes here:
            int count=0;
            sentence=sentence.replaceAll(",","");
            String[] str=sentence.split(" ");
            for(String element:str){
                if(element.equals(target)){
                    count++;
                }

            }
            if(count==2){
                return true;
            }else{
                return false;
            }


        }
    }

