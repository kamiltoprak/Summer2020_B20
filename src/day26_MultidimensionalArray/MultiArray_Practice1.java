package day26_MultidimensionalArray;

import java.util.Arrays;

public class MultiArray_Practice1 {
    /*
    testers:{"Lilia","Odina","Cristina","Elkem"}
    dev:{"Ahmet","Erfan","Roza","Srah"}
    SM:{"Nurmamet"}
    PO:{"Nadir"}
    BA:{"Alex"}
    ST : TESTERS, DEVELOPERS , SCRUM MASTER , PO BA
     */
    public static void main(String[] args) {
        String[] testers={"Lilia","Odina","Cristina","Elkem"};
        String[] developers={"Ahmet","Erfan","Roza","Sarah"};
        String[] SM={"Nurmamet"};
        String[] PO={"Nadir"};
        String[] BA={"Alex"};

        String[][] scrumTeam={testers,developers,SM,PO,BA};
        System.out.println(Arrays.deepToString(scrumTeam));
        scrumTeam[4][0]="Adan";
        scrumTeam[1][2]="Emine";
        System.out.println("================================");
        System.out.println(Arrays.deepToString(scrumTeam));


        System.out.println("================================");

        int [][] scores={{10,20,30,45},{60,55,75,105},{93,48,125,135}};
                 //           0               1               2

        // print out  numbers that  are  divisible  3  by  5
        /*for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(scores[i][j]%3==0 ||scores[i][j]%5==0){
                    System.out.print(scores[i][j]+" ");

                }
            }

        }*/


        for(int[] each1DArray:scores) {
            for (int eachElement : each1DArray) {
                if (eachElement % 3 == 0 || eachElement % 5 == 0) {
                    System.out.print(eachElement + " ");
                }
            }
        }


        System.out.println("======================================");
        int [][] scores1={{10,20,30,45},{60,55,75,105}};
        int [][] scores2={{100,200,300,450},{600,550,750,1050}};

        int[][][] arr3D={{{10,20,30,45},{60,55,75,105}},{{100,200,300,450},{600,550,750,1050}}};
            //                            0                                   1
        //                      0               1                   0               1
        //                  0 ,1 ,2, 3      0 ,1 ,2, 3      0 ,1 ,2, 3         0 ,1 ,2, 3
    }
}
