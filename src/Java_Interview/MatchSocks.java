package Java_Interview;
/*John works at a clothing store. He has a large pile of socks that
        he must pair by color for sale. Given an array of integers representing
        the color of each sock,
        determine how many pairs of socks with matching colors there are.*/
import java.util.Arrays;
import java.util.Scanner;

public class MatchSocks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter how many single  sock do  you  have ");
        int numberOfSocks=scan.nextInt();
        int[] sock=new int[numberOfSocks];
        for (int i = 0; i <=numberOfSocks-1 ; i++) {
            System.out.println("enter sock "+(i+1)+" size");
            sock[i]=scan.nextInt();
        }
        //int[] sock={10,20,20,10,10,30,50,10,20};
        Arrays.sort(sock);
        int matchSocks=0;
        int count=0;
        System.out.println(Arrays.toString(sock));
        for (int j = 0; j<= sock.length - 2;j+=count ) {
            if(sock[j]==sock[j+1]){
                matchSocks++;
                count=2;
            }else{
                count=1;
            }

        }
        System.out.println(matchSocks);
    }
}
