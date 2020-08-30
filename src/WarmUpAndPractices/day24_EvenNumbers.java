package WarmUpAndPractices;
/*Create an int array called numbers that has length of 100 and Assign 1-100 to each index of the array.
        then print out all the even numbers. MUST use continue statement*/
public class day24_EvenNumbers {
    public static void main(String[] args) {
        int[] a=new int[100];
       /* int count=1;
        int odd=0;
        int even=0;*/
        for (int i = 1; i <=100 ; i++) {
            /*a[i] = count;
            count++;*/
            a[i]=i;
            if (a[i]%2 != 0) {
                continue;
                /*even+=a[i];*/
            }/*else{
                even+=a[i];
            }*/
            System.out.println(a[i]);
        }
        /*System.out.println("total of even numbers: " + even);
        System.out.println("total of odd numbers: " + odd);*/


    }
}
