package day25_Practices;
/*Write a program that will take five Strings and save them into an array called arr.
        and  Use for loop to print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.
        Example: arr -> ["apple", "banana"]
        prints:  appban*/
public class FirstThreeChars {
    public static void main(String[] args) {
        String[] words={"Apple","Banan","Strawberry","Java","Python"};
        System.out.println(words[0].substring(0,3));

        System.out.println("=============================================");

        for(String each:words){
            System.out.println(each.substring(0,3));
        }

    }
}
