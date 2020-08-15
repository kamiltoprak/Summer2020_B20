package ReplitTry;
import java.util.*;

public class R214_Methods_with_ArrayList15_search {

        public static String search(ArrayList<String> r, String find)
        {
            String str="";
            r.removeIf(p->!p.contains(find));
            if(r.size()>=1){
                for (String each:r) {
                    str+=each;
                }
            }else{
                str+="search failed";
            }
            return str;
        }//end wineSeller

        public static void main(String[] args)
        {

            ArrayList<String>  arr = new ArrayList<String>();
            arr.add("2");
            arr.add("6");
            arr.add("foo bar");
            arr.add("abc");


            String find_tst = search(arr,"foo");
            System.out.print(find_tst);//foo bar


        }//end main
    }

