public class MEDIUMFindMinimuminRotatedSortedArray {
    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};
        System.out.print(answer(nums));

    }

  static   int answer(int[] nums) {
        int left = 0;
      int right = nums.length - 1;
      while (left < right) {
          int mid = left + (right - left) / 2;
          if (nums[mid] < nums[right]) {
              right = mid;
          } else {
              left = mid + 1;
          }
      }
      return nums[left];



    }
}