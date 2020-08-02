package Library;

import java.util.Arrays;

public class Util {
    public static String removeDup(String str) { //abab
        String nonDup = ""; //ab
        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }

        }
        return nonDup;


    }
    // removes the duplicates and returns the value string

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }
    // reverse the string and retunr the value

    public static int frequence(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
    //  finds the frequency of char from string str and returns it as int


    public static String frequencyOfChars(String str) {
        String expectedResult = "";//A2B3C3
        String nonDup = Util.removeDup(str); //ABC
        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch1 = nonDup.charAt(i);
            int count1 = Util.frequence(str, ch1);
            expectedResult += "" + ch1 + count1;//
        }
        return expectedResult;
    }
    // frequency of each chart in the string.

    public static String formatFullName(String first, String last) {
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " + last;

        return fullName;
    }
    // formats the full name

    public static String unique(String str) {
        String unique = "";

        for (char each : str.toCharArray()) {

            int count = frequence(str, each);
            if (count == 1) {
                unique += each;
            }
        }
        return unique;

    }
    // retunrs the uniiques from the string



    public static int minNum(int[] nums) {
        int min = nums[0];
        /*for (int i = 0; i <nums.length ; i++) {
            if(number1>nums[i]){
                number1=nums[i];
            }
        }*/
        for (int each : nums) {
            if (min > each) {
                min = each;
            }
        }

        return min;

    }
    // find and returns the min number from in array
    public static Integer minNum(Integer[] nums) {
        Integer min = nums[0];
        /*for (int i = 0; i <nums.length ; i++) {
            if(number1>nums[i]){
                number1=nums[i];
            }
        }*/
        for (Integer each : nums) {
            if (min > each) {
                min = each;
            }
        }

        return min;

    }
    // find and returns INTERGER Class the min number from in array
    public static double minNum(double[] nums) {
        double min = nums[0];
        /*for (int i = 0; i <nums.length ; i++) {
            if(number1>nums[i]){
                number1=nums[i];
            }
        }*/
        for (double each : nums) {
            if (min > each) {
                min = each;
            }
        }

        return min;

    }
    // find and returns double  the min number from in array
    public static Double minNum(Double[] nums) {
        Double min = nums[0];
        /*for (int i = 0; i <nums.length ; i++) {
            if(number1>nums[i]){
                number1=nums[i];
            }
        }*/
        for (Double each : nums) {
            if (min > each) {
                min = each;
            }
        }

        return min;

    }
    // find and returns Double CLASS the min number from in array


    public static int maxNum(int[] nums) {
        int max = nums[0];
      /*  for (int i = 0; i <nums.length ; i++) {
            if(number<nums[i]){
                number=nums[i];
            }
        }*/
        for (int each : nums) {
            if (max < each) {
                max = each;
            }
        }


        return max;
    }
    // find and returns the max number from in array
    public static Integer maxNum(Integer[] nums) {
        Integer max = nums[0];
      /*  for (int i = 0; i <nums.length ; i++) {
            if(number<nums[i]){
                number=nums[i];
            }
        }*/
        for (Integer each : nums) {
            if (max < each) {
                max = each;
            }
        }


        return max;
    }
    // find and returns Integer Class the max number from in array
    public static double maxNum(double[] nums) {
        double max = nums[0];
      /*  for (int i = 0; i <nums.length ; i++) {
            if(number<nums[i]){
                number=nums[i];
            }
        }*/
        for (double each : nums) {
            if (max < each) {
                max = each;
            }
        }


        return max;
    }
    // find and returns double the max number from in array
    public static Double maxNum(Double[] nums) {
        Double max = nums[0];
      /*  for (int i = 0; i <nums.length ; i++) {
            if(number<nums[i]){
                number=nums[i];
            }
        }*/
        for (Double each : nums) {
            if (max < each) {
                max = each;
            }
        }


        return max;
    }
    // find and returns DOUBLE CLASS the max number from in array



    public static int[] addElement(int[] arr, int num) {
        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (int each : arr) {
            arr2[i] = each;
            i++;
        }

        return arr2;
    }
    // inserts the int element to the array
    public static Integer[] addElement(Integer[] arr, Integer num) {
        Integer[] arr2 = new Integer[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (Integer each : arr) {
            arr2[i] = each;
            i++;
        }

        return arr2;
    }
    // inserts the Integer Class element to the array
    public static double[] addElement(double[] arr, double num) {
        double[] arr2 = new double[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (double each : arr) {
            arr2[i] = each;
            i++;
        }

        return arr2;
    }
    // inserts the double element to the array
    public static Double[] addElement(Double[] arr, Double num) {
        Double[] arr2 = new Double[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (Double each : arr) {
            arr2[i] = each;
            i++;
        }

        return arr2;
    }
    // inserts the DOUBLE CLASS element to the array
    public static char[] addElement(char[] arr, char num) {
        char[] arr2 = new char[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (char each : arr) {
            arr2[i] = each;
            i++;
        }

        return arr2;
    }
    // inserts the char element to the array
    public static Character[] addElement(Character[] arr, Character num) {
        Character[] arr2 = new Character[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (Character each : arr) {
            arr2[i] = each;
            i++;
        }

        return arr2;
    }
    // inserts the Chracter Class element to the array
    public static String[] addElement(String[] arr, String num) {
        String[] arr2 = new String[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (String each : arr) {
            arr2[i] = each;
            i++;
        }

        return arr2;
    }
    // inserts the String element to the array



    public static int[] sortDesc(int[] arr) {
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    // sorts int array in descending order and returns it
    public static Integer[] sortDesc(Integer[] arr) {
        Arrays.sort(arr);

        Integer[] arr2 = new Integer[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    // sorts Integer array in descending order and returns it
    public static double[] sortDesc(double[] arr) {
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;

    }
    // sorts double array in descending order and returns it
    public static Double[] sortDesc(Double[] arr) {
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    // sorts Double array in descending order and returns it
    public static char[] sortDesc(char[] arr) {
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;

    }
    // sorts char array in descending order and returns it
    public static Character[] sortDesc(Character[] arr) {
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    // sorts Character array in descending order and returns it
    public static String[] sortDesc(String[] arr) {
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    // sorts String array in descending order and returns it


    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines two integer array and returns it
    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2) {
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for (Integer each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Integer each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines two Integer array and returns it
    public static char[] combine2Arrays(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];

        int i = 0;
        for (char each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (char each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines two char array and returns it
    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2) {
        Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for (Character each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Character each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines two Character array and returns it
    public static double[] combine2Arrays(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (double each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines two double array and returns it
    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2) {
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for (Double each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Double each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines two Double array and returns it
    public static String[] combine2Arrays(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (String each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines two double array and returns it






}



