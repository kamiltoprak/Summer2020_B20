package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {
        String[] arr={"Anam","Nickolas","Amir","Nurmamet"};
       String minLength=arr[0];
        /*for (int i = 1; i <arr.length ; i++) {
            if(minLength.length()>arr[i].length()){
                minLength=arr[i];
            }
        }*/

        int minLenght=arr[0].length();
        for (int i = 0; i <arr.length-1 ; i++) {
            int l=arr[i].length();
            if(i<minLenght){
                minLenght=l;
            }
        }

        for (int i = 0; i <=arr.length-1 ; i++) {
            if(arr[i].length()==minLenght){
                System.out.println(arr[i]);
            }

        }

    }
}
