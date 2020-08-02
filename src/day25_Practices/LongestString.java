package day25_Practices;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};
        int maxLength = arr[0].length();
        for (String each : arr) {
            int l = each.length();

            if (l > maxLength) {
                maxLength = l;
            }
        }

        for (String each : arr) {
            if (each.length() == maxLength) {
                System.out.println(each);
            }

        }
    }
}
