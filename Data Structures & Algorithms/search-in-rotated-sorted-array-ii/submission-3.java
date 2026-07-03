class Solution {
    public boolean search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return true;
            } else {
                return false;
            }
        }
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }

            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
                continue;
            }

            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target <nums[mid]){
                    end =mid -1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>nums[mid]&& target<=nums[end]){
                    start = mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
        return false;
    }
}

/*
naive
class Solution {
    public boolean search(int[] nums, int target) {
           for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

}
*/