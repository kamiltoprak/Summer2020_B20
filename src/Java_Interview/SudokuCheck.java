package Java_Interview;

public class SudokuCheck {
    public static void main(String[] args) {
        /*int[][] sudoku = {{5, 8, 9, 6, 7, 4, 2, 1, 3},
                {7, 4, 3, 1, 8, 2, 9, 5, 6}, {1, 2, 6, 9, 5, 3, 8, 7, 4}, {9, 3, 5, 4, 2, 1, 7, 6, 8},
                {4, 1, 2, 8, 6, 7, 3, 9, 5}, {6, 7, 8, 3, 9, 5, 1, 4, 2}, {8, 6, 4, 2, 1, 9, 5, 3, 7},
                {3, 9, 7, 5, 4, 8, 6, 2, 1}, {2, 5, 1, 7, 3, 6, 4, 8, 9}};*/

        int[][] sudoku = {{1, 2, 3, 4},
                        {4, 3, 2, 1},
                        {3, 4, 1, 2},
                        {2, 1, 4, 3}};

        int count = 0;
        int n = 2;

        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                count = 0;
                int a = sudoku[i][j];
                for (int k = 0; k < n * n; k++) {
                    if (a == sudoku[i][k]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("1 false");
                    System.exit(0);
                }
                count = 0;
                for (int k = 0; k < n * n; k++) {
                    if (a == sudoku[k][i]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("2 false");
                    System.exit(0);
                }
                count = 0;
                // all  column and rows  are done
                int t = 0;
                for (int m = 0; m < n * n; m++) {
                    int x = 0;
                    if (m > n) {
                        x += (m / n) * n;
                    }
                    int y = (m % n) * n;
                    count = 0;
                    for (int k = x; k < n; k++) {    //        0 ,    1,         2           0 ,      1,         2
                        for (int l = y; l < n + y; l++) { //  0,1,2,  0, 1, 2,    0,1,2     3, 4, 5,  3, 4,5,    3,4,5
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }
                    }
                    if (count > 1) {
                        System.out.println(count);
                        System.out.println("3 false");
                        System.exit(0);
                    }
                }
                // all  small   squares  are   done

/*
                if (i < 3 && (j >= 3 && j < 6)) {
                    for (int k = 3; k < 6; k++) {
                        for (int l = 3; l < 6; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i < 3 && (j >= 6 && j < 9)) {
                    for (int k = 6; k < 9; k++) {
                        for (int l = 6; l < 9; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                /////column and rows  are done


                count = 0;
                if (i < 3 && j < 3) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i < 3 && (j >= 3 && j < 6)) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 3; l < 6; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i < 3 && (j >= 6 && j < 9)) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 6; l < 9; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                //  frst three  rectanglars are  done
                count = 0;
                if ((i >= 3 && i < 6) && j < 3) {
                    for (int k = 3; k < 6; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (((i >= 3 && i < 6) && (j >= 3 && j < 6))) {
                    for (int k = 3; k < 6; k++) {
                        for (int l = 3; l < 6; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (((i >= 3 && i < 6) && j >= 6)) {
                    for (int k = 3; k < 6; k++) {
                        for (int l = 6; l < 9; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                // second 3  rectangler  are done
                count = 0;
                if (i >= 6 && j < 3) {
                    for (int k = 6; k < 9; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i >= 6 && (j >= 3 && j < 6)) {
                    for (int k = 6; k < 9; k++) {
                        for (int l = 3; l < 6; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i >= 6 && j >= 6) {
                    for (int k = 6; k < 9; k++) {
                        for (int l = 6; l < 9; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }

            }


        }*/

        /*int count = 0;
        int[][] sudoku = {{5, 8, 9, 6, 7, 4, 2, 1, 3},
                {7, 4, 3, 1, 8, 2, 9, 5, 6}, {1, 2, 6, 9, 5, 3, 8, 7, 4}, {9, 3, 5, 4, 2, 1, 7, 6, 8},
                {4, 1, 2, 8, 6, 7, 3, 9, 5}, {6, 7, 8, 3, 9, 5, 1, 4, 2}, {8, 6, 4, 2, 1, 9, 5, 3, 7},
                {3, 9, 7, 5, 4, 8, 6, 2, 1}, {2, 5, 1, 7, 3, 6, 4, 8, 9}};


        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                count = 0;
                int a = sudoku[i][j];
                for (int k = 0; k < 9; k++) {
                    if (a == sudoku[i][k]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("false");
                    System.exit(0);
                }
                count = 0;
                for (int k = 0; k < 9; k++) {
                    if (a == sudoku[k][i]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("false");
                    System.exit(0);
                }
                count = 0;
                if (i < 3 && j < 3) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i < 3 && (j >= 3 && j < 6)) {
                    for (int k = 3; k < 6; k++) {
                        for (int l = 3; l < 6; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i < 3 && (j >= 6 && j < 9)) {
                    for (int k = 6; k < 9; k++) {
                        for (int l = 6; l < 9; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                /////column and rows  are done


                count = 0;
                if (i < 3 && j < 3) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i < 3 && (j >= 3 && j < 6)) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 3; l < 6; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i < 3 && (j >= 6 && j < 9)) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 6; l < 9; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                //  frst three  rectanglars are  done
                count = 0;
                if ((i >= 3 && i < 6) && j < 3) {
                    for (int k = 3; k < 6; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (((i >= 3 && i < 6) && (j >= 3 && j < 6))) {
                    for (int k = 3; k < 6; k++) {
                        for (int l = 3; l < 6; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (((i >= 3 && i < 6) && j >= 6)) {
                    for (int k = 3; k < 6; k++) {
                        for (int l = 6; l < 9; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                // second 3  rectangler  are done
                count = 0;
                if (i >= 6 && j < 3) {
                    for (int k = 6; k < 9; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i >= 6 && (j >= 3 && j < 6)) {
                    for (int k = 6; k < 9; k++) {
                        for (int l = 3; l < 6; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }
                count = 0;
                if (i >= 6 && j >= 6) {
                    for (int k = 6; k < 9; k++) {
                        for (int l = 6; l < 9; l++) {
                            if (a == sudoku[k][l]) {
                                count++;
                            }
                        }

                    }
                    if (count > 1) {
                        System.out.println("false");
                        System.exit(0);
                    }
                }

            }


        }
        System.out.println("True");*/
            }
        }
        System.out.println("=================================");
        System.out.println("True");
    }
}

