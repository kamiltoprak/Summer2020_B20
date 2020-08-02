package Java_Interview;

import java.util.Arrays;
import java.util.Scanner;

/*Emma is playing a new mobile game that starts with consecutively numbered clouds.
Some of the clouds are thunderheads and others are cumulus.
 She can jump on any cumulus cloud having a number that is equal to
 the number of the current cloud plus  or . She must avoid the thunderheads.
  Determine the minimum number of jumps it will take Emma to jump from her starting postion
  to the last cloud. It is always possible to win the game.
        For each game, Emma will get an array of clouds numbered
        if they are safe or  if they must be avoided. For example,
         indexed from . The number on each cloud is its index in the
          list so she must avoid the clouds at indexes  and . She could
          follow the following two paths:  or . The first path takes
           jumps while the second takes .
        Function Description
        Complete the jumpingOnClouds function in the editor below.
        It should return the minimum number of jumps required, as an integer.
        jumpingOnClouds has the following parameter(s):
        c: an array of binary integers
        Input Format
        The first line contains an integer , the total number of clouds.
        The second line contains  space-separated binary integers describing clouds  where .
        Constraints
        Output Format
        Print the minimum number of jumps needed to win the game.
        Sample Input 0

        7
        0 0 1 0 0 1 0
        Sample Output 0

        4
        Explanation 0:
        Emma must avoid  and . She can win the game with a minimum of  jumps:

        jump(2).png

        Sample Input 1

        6
        0 0 0 0 1 0
        Sample Output 1

        3
        Explanation 1:
        The only thundercloud to avoid is . Emma can win the game in  jumps:

        jump(5).png*/
public class CloudJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter how many single  sock do  you  have ");
        int cloudNumber = scan.nextInt();
        int[] cloud = new int[cloudNumber];
        for (int i = 0; i <= cloudNumber - 1; i++) {
            System.out.println("enter cloud " + (i + 1) + " number");
            cloud[i] = scan.nextInt();
        }
        //int[] cloud={0,0,0,0,0,0,0,0};
        int cloudJump = 0;
        int count = 0;
        int a=0;
        System.out.println(Arrays.toString(cloud));
        if(cloudNumber==2){
            cloudJump++;

        }else {


            for (int j = 0; j <= cloud.length - 3; j += count) {

                if (cloud[j] == 0 && cloud[j + 1] == 0 && cloud[j + 2] == 0) {
                    cloudJump++;
                    count = 2;
                } else if (cloud[j] == 0 && cloud[j + 1] == 0 && cloud[j + 2] == 1) {
                    cloudJump++;
                    count = 1;
                } else if (cloud[j] == 0 && cloud[j + 1] == 1 && cloud[j + 2] == 0) {
                    cloudJump++;
                    count = 2;
                } else if (cloud[0] == 1 && cloud[1] == 0) {
                    cloudJump++;
                    count = 1;
                }
                a = j;
            }
            if (a < cloud.length - 3) {
                cloudJump += 1;
            }
        }
        System.out.println(cloudJump);
    }
}
