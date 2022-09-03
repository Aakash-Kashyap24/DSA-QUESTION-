import java.util.Arrays;

public class findPivotPointsRotatedArrays {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(findPivotPoint(nums));
    }

    static int findPivotPoint(int[] nums) {

        int start = 0;
        int end = nums.length -1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid+1];
            }
            if (mid > start && nums[mid] <nums[mid - 1]) {
                return nums[mid-1];
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }
}
