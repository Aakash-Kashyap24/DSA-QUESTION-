import java.util.Arrays;

public class DynamicProgramingTrappingRainWater {
    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};
        System.out.print(answer(nums));

    }

    static int answer(int[] nums) {

        int len = nums.length;

        int maxSum = 0;
        int currSum =0 ;

        if (len == 1) {
            return nums[0];
        }

        if (len <= 0) {
            return -1;
        }



        for (int index = 0; index < len;index++ ) {

            if (nums[index] >= nums[len - 1]) {
                return nums[index];
            }
            currSum = Math.min((currSum), index + nums[index]);


            maxSum++;

        }


        return maxSum ;




    }
}