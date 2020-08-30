package day24_Arrays;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        String s1 = Arrays.toString(arr);
        System.out.println(s1);
        System.out.println("================================================");

        String[] names={"kamil", "mehmet ", "ali", "veli", "samed"};
        //System.out.println(names);
        System.out.println(Arrays.toString(names));

        System.out.println("============================================");

        int[] nums={5,4,5,2,6,9,7};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);//asending order [2,4,5,5,6,7,9]
        System.out.println(Arrays.toString(nums));

        System.out.println("max number:"+nums[nums.length-1]);
        System.out.println("min number:"+nums[0]);

        System.out.println("=====================================================");
        char[] ch={'a','f','f','r','w','d','s'};
        String[] student={"Mehdi","Elkem","Meee","Trump"};
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        System.out.println("=============================================================");

        int[] arr1={1,2,3};
        int[] arr2={1,2,3};

        boolean r1=Arrays.equals(arr1,arr2);

        System.out.println(r1);

        int[] arr3={2,1,3};
        Arrays.sort(arr2);//arr: 1,2,3
        Arrays.sort(arr3); // arr : 1,2,3
        boolean r2=Arrays.equals(arr1,arr3);
        System.out.println(r2);

        int[] arr4={1,1,2,3};// index  not equals
        int[] arr5={1,2,3};

        boolean r3=Arrays.equals(arr4,arr5);
        System.out.println(r3);



    }

}
