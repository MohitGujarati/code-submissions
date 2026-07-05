class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int res = Integer.MIN_VALUE;

        if(nums[end]<target){
            return end+1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                res = mid;
                end = mid - 1;
            }
        }

        return res;
    }
}