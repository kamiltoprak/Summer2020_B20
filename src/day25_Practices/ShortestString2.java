package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {


        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};
        String minLength = arr[0];
        int minLenght = arr[0].length();
        for (String each : arr) {
            int l = each.length();

            if (l < minLenght) {
                minLenght = l;
            }
        }

        for (String each : arr) {
            if (each.length() == minLenght) {
                System.out.println(each);
            }

        }
    }

}