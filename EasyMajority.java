import java.util.ArrayList;
import java.util.Arrays;

public class EasyMajority {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 3};
        System.out.print(answer(nums));
    }
    static int answer(int[] nums){
        Arrays.sort(nums);
        int major=nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(count==0){
                major=nums[i];
                count++;
            }
            if(major==nums[i])count++;
            else count--;
        }
        return major;



    }
}