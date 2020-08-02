package ReplitTry;

public class R204_Arrays_AssessmentTest3_3Reverseanarray {
/*    Write the definition of a method reverse, whose parameter is an array of Strings. The method reverses the elements of the array. The method returns an array of strings in the reversed order.
            Example:
    input: ["apple", "pear"]
    output: ["pear", "apple"]*/

    public static void main(String[] args) {

        }

        /**
         * Reverses the order of the elements in the specified array
         * @param arr
         * @return array of strings
         */
        public static String[] reverse(String[] arr) {
            //write your codes here
            String[] newArr=new String[arr.length];

            int k=arr.length-1;
            for(String element:arr){
                newArr[k]=element;
                k--;
            }

            return newArr;


        }
    }


