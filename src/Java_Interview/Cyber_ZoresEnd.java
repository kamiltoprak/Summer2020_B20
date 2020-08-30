package java_Interview;

import java.util.Arrays;

//=> given  an  array  of integer how do you  put  zeros at the end
// of  array  without sorting an  array ?
// for example input:[4,5,0,0,2,0,1,0]output:[[4,5,2,1,0,0,0,0]
public class Cyber_ZoresEnd {
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 0, 2, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int a = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        a = arr[j];
                        arr[j] = arr[i];
                        arr[i] = a;
                        break;
                    }
                }


            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
