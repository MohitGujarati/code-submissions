class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int peek = Integer.MIN_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((mid == 0 || nums[mid] > nums[mid - 1])
                && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                peek = mid;
                return mid;
            }

            else if (nums[mid] < nums[mid + 1] && mid < end) {
                start = mid + 1;
            } else if (nums[mid] < nums[mid - 1] && mid > start) {
                end = mid - 1;
            }
        }

        return peek;
    }
}