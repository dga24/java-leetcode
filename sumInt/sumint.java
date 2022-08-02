package sumInt;
import java.util.Arrays;

public class sumint{
    public static void main(String[] args) {
        System.out.println("start");
        int[] nums = {10,20,34,50};
        int[] sum;
        sum  = runningSum(nums);
        System.out.println(Arrays.toString(sum));
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];    
        for(int i=0; i<nums.length; i++){
            for (int j = 0; j <= i; j++) {
                sum[i]+= nums[j];
            }
            }
            return sum;
    }
}

