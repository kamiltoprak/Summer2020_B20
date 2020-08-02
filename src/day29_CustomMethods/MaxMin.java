package day29_CustomMethods;

public class MaxMin {
    public static void main(String[] args) {
        int[] nums={10,12,12,3234,32,32,1,232,4242,};
        max(nums);
        min(nums);
    }

    public static void max(int[] nums) {
        int number=nums[0];
      /*  for (int i = 0; i <nums.length ; i++) {
            if(number<nums[i]){
                number=nums[i];
            }
        }*/
        for(int each:nums){
            if(number<each){
                number=each;
            }
        }


        System.out.println(number);
    }
    public static void min(int[] nums) {
        int number1=nums[0];
        /*for (int i = 0; i <nums.length ; i++) {
            if(number1>nums[i]){
                number1=nums[i];
            }
        }*/
        for(int each:nums){
            if(number1>each){
                number1=each;
            }
        }


        System.out.println(number1);
    }
}
