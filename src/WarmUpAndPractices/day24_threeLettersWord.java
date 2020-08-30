package WarmUpAndPractices;
/*Write a program that will take five Strings and save them into an array called arr.
 and  Use for loop to print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.
        Example: arr -> ["apple", "banana"]
        prints:  appban*/
public class day24_threeLettersWord {
    public static void main(String[] args) {
        String[] arr={"asaa","sdsdsd","dsdsw","sdsdsq","ewetgd"};
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==0){
                System.out.print(arr[i].substring(arr[i].length()-3,arr[i].length())+arr[i+1].substring(0,3));
            }
            System.out.println();
        }
        

    }
}
