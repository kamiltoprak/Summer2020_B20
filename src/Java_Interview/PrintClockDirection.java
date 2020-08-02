package Java_Interview;
/*Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
        For example, given the following matrix:
        [[1,  2,  3,  4,  5],
        [6,  7,  8,  9,  10],
        [11, 12, 13, 14, 15],
        [16, 17, 18, 19, 20]]
        You should print out the following:
        1
        2
        3
        4
        5
        10
        15
        20
        19
        18
        17
        16
        11
        6
        7
        8
        9
        14
        13
        12*/
import java.util.Scanner;

public class PrintClockDirection {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter Column Number");
            int columns=scan.nextInt();
            System.out.println("Enter Row Number");
            int rows=scan.nextInt();


            int[][] number=new int[rows][columns];
            int count=1;
            for (int i = 0; i <=rows-1 ; i++) {
                for (int j = 0; j <=columns-1 ; j++) {
                    number[i][j]=count;
                    count++;
                    System.out.print(number[i][j]+"\t");
                }
                System.out.println();
            }


            System.out.println("===========================");






            int rowNumber=0;
            int columnNumber=0;
        /*int[][] number={{1,  2, 3, 4, 5, 6, 7, 8},
                        {9, 10,11,12,13,14,15,16},
                        {17,18,19,20,21,22,23,24}};*/
            for(int k=(columns*2)-1; k>0; k--){
                for (int i = rowNumber; i <rows-rowNumber; i++) {
                    for (int j = columnNumber; j < columns-columnNumber; j++) {
                        if(i>j){
                            System.out.println(number[i][(columns-1)-columnNumber]);
                            break;
                        }
                        System.out.println(number[i][j]);
                    }
                }
                columnNumber++;
                for (int i=(rows-1)-rowNumber; i >=columnNumber; i--) {

                    for (int j = (columns - 1) - columnNumber; j >= rowNumber; j--) {
                        if (i < (rows - 1) - rowNumber) {
                            System.out.println(number[i][rowNumber]);
                            break;
                        }
                        System.out.println(number[i][j]);
                    }

                }
                rowNumber++;

            }





        }
    }

