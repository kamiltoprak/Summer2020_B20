package ReplitTry;
/*Complete the combineNames method to return a new String array that is composed of the first name and last name of each of the parameters.

        This may be confusing so look at the example:
        first_names = {"Bulent","Ebrahim"}
        last_names = {"Pola","Emam"}

        returns a new String array with {"Bulent Pola",  "Ebrahim Emam"}*/
public class R234_FullName {
    public static String[] combineNames(String[] first_names, String[] last_names)
    {
        String[] name=new String[first_names.length];

        for(int i=0; i<=name.length-1;i++){
            name[i]=first_names[i]+" "+last_names[i];

        }

        return name;


    }



    public static void main(String[] args)
    {
        //feel free to test code here


    }
}

