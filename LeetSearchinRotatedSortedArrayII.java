public class LeetSearchinRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int target= 5;
        System.out.print(ssearch(nums,target));
    }


    static int ssearch(int[] nums, int target) {
        int pivotPoints = findPivotPoint(nums);

        if (pivotPoints == -1) {
            return binnarySearch(nums, target,0, nums.length -1);
        }




        if (nums[pivotPoints] == target) {
            return pivotPoints;
        }
        if (nums[0] >= target) {
            return binnarySearch(nums, target, pivotPoints + 1, nums.length - 1);
        }

        return binnarySearch(nums, target, 0, pivotPoints - 1);



    }

    static int binnarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[0]==target){
                return 0;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else return mid;
        }
        return -1;


    }
    static int findPivotPoint(int[] nums) {

        int start = 0;
        int end = nums.length -1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] <nums[mid - 1]) {
                return mid-1;
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
