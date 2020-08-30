package day23_Arrays;

public class FrequencyOfChar1 {
    public static void main(String[] args) {
        String str = "BBCCDDeeeefffff";
        String nonDup = "";// BCDEF

        for (int i = 0; i <= str.length() - 1; i++) { //remove dublicatefrom str
            String ch = "" + str.charAt(i); //B,B,C......
            if (nonDup.contains(ch)) {
                continue;
            } else {
                nonDup += ch;
            }
        }
        String expectedResult = ""; //B2C2D2
        // str="BBCCDD" nonDup="BCD"  =====> B2C2D2
        for (int j = 0; j <= nonDup.length() - 1; j++) { //iterates  the string
            char ch=nonDup.charAt(j); //b,C, D .....every single chrater
            int count=0; // 3,2,45,
            for (int i = 0; i <=str.length()-1 ; i++) {
                if(str.charAt(i)==ch){
                    count++;
                }

            }
            expectedResult+=""+ch+count;
        }

        /*char ch1 = nonDup.charAt(0);//B
        int count1 = 0;// 1+1=2
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ch1) {
                count1++;
            }

        }
        expectedResult = "" + ch1 + count1;

        char ch2 = nonDup.charAt(1);//B
        int count2 = 0;// 1+1=2
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ch2) {
                count2++;
            }

        }
        expectedResult += "" + ch2 + count2;*/

        System.out.println(expectedResult);
    }
}
