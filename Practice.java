import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) throws IOException {
        int[] nums = {1,2};
        System.out.print(answer(nums));
    }
    static List<Integer> answer(int[] nums) {

        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();

        int firstMajor =Integer.MAX_VALUE;        int firstCount = 0;

        int secondMajor = Integer.MIN_VALUE;
        int secondCount = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == firstMajor) {
                firstCount++;
            } else if (nums[j] == secondMajor) {
                secondCount++;
            } else if (secondCount == 0) {
                secondMajor = nums[j];
                secondCount++;
            }
            if (firstCount == 0) {
                firstMajor = nums[j];
                firstCount++;
            }

            else {firstCount--;

            secondCount--;

        }

        }
        firstCount = 0;
        secondCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstMajor) {
                firstCount++;
            } else if (nums[i] == secondMajor) {
                secondCount++;
            }
        }
        if (firstCount > nums.length / 3) {
            ans.add(firstMajor);

        }
        if (secondCount > nums.length / 3) {
            ans.add(secondMajor);

        }

        return ans;
    }
}
