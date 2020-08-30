package day24_Arrays;

public class UniqueNumbers2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int b : arr) {//b represent  each  elements in the array
                if (num == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(num);
            }
        }
    }
}
