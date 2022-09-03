import java.util.ArrayList;
import java.util.List;

public class MediumTopP2Elements {
    public static List<Integer> main(String[] args) {
        int[] nums = {1, 3, 3};

        return result(nums);
    }

        static List<Integer> result(int[] nums){
            List<Integer> ans = new ArrayList<Integer>();

            int firstMajor = Integer.MAX_VALUE;
            int firstSum = 0;
            int secondMajor = Integer.MIN_VALUE;
            int secondSum = 0;


            for (int i = 0; i < nums.length; i++) {
                if (nums[i] ==  firstMajor) {
                    firstSum++;
                } else if (nums[i] == secondMajor) {
                    secondSum++;
                } else if (firstSum == 0) {
                    firstMajor = nums[i];
                    firstSum=1;
                } else if (secondSum == 0) {
                    secondMajor = nums[i];
                    secondSum=1;
                }else {
                    firstSum--;
                    secondSum--;
                }
            }

            firstSum = 0;
            secondSum = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == firstMajor) {
                    firstSum++;
                } else if (nums[i] == secondMajor) {
                    secondSum++;
                }
            }

            if (firstSum > nums.length / 3) {
                ans.add(firstMajor);
            }
            if (secondSum > nums.length/3) {
                ans.add(secondMajor);
            }
            return ans;



        }



}