package day15_String;

public class subsstring_method {
    public static void main(String[] args) {
        String sentence ="Java is fun";
        //                0123456789....
        // substring(beg index,  end index)
        String word= sentence.substring(0,4);
        System.out.println(word);

        String word2 = sentence.substring(8,11);
        System.out.println(word2);

        System.out.println("=================================");
        String sentence2="I like Movies and  TV  Series";

        String word3=sentence2.substring(7,13);
        System.out.println(word3);


        System.out.println("====================================");
        String firstName="mUhTar";
        String firstCharacter=firstName.substring(0,1);
        System.out.println(firstCharacter);
        String rest=firstName.substring(1,firstName.length());
        System.out.println(rest);



        System.out.println("=================================");
        firstName=firstCharacter.toUpperCase()+rest.toLowerCase();
        System.out.println(firstName);

        System.out.println("========================================================");
        String lastname= "dsFsdTsds";
        String firstChar=lastname.substring(0,1);//s
        String remainning = lastname.substring(1); // chool

        System.out.println(firstChar);
        System.out.println(remainning);

        lastname=firstChar.toUpperCase()+remainning.toLowerCase();//"School"

        System.out.println(lastname);
        System.out.println("====================================================");
        String s="I like Game Of Thrones";
        // 01234567
        String series=s.substring(7);
        System.out.println(series);
        System.out.println("====================================================");

        String s2="I like Java programing Language ";
        //J index number is 7
        String language = s2.substring(7);
        System.out.println(language);



    }
}
