package day24_Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3};

        for (int j = 0; j < arr.length; j++) {
                // j: 0 1 2 3 4

            int num1 = arr[j]; //0 1 2 3 4
            int count = 0;

            for (int i = 0; i < arr.length ; i++) {// only calculates frequency  of num
                int each = arr[i]; //1 1 2 3 3
                if (each == num1) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(num1);
            }

        }
    }
}
