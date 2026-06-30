class Solution {
    public int search(int[] nums, int target) {
        int low = 0;

        int high = nums.length - 1;

        int min = target;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == min) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (min >= nums[low] && min < nums[mid]) {
                    high = mid - 1;

                }

                else {
                    low = mid + 1;
                }

            } else if (min > nums[mid] && min <= nums[high]) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
