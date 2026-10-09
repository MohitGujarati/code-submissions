class Solution {
    public int peakIndexInMountainArray(int[] arr) {

     return  findPeakElement(arr);
        
    }


    public int findPeakElement(int[] nums) {

    int n = nums.length;

    int start = 1;
    int end = n - 2;

    if (n == 1)
      return 0;

    if (nums[0] > nums[1])
      return 0;

    if (nums[n-1] > nums[n - 2])
      return n-1;

    int mid;

    while (start <= end) {

      mid = start + (end - start) / 2;

      if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
        return mid;
      }

      if (nums[mid] < nums[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }

    return -1;

  }
}



