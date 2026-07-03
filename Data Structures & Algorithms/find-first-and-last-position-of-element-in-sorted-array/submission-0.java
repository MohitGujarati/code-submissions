class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1,-1};
        }

        int first = firstIndex(nums,target);
        
        int last = lastIndex(nums, target);

        return new int[]{first,last};
    }

    public int firstIndex(int[] nums,int target){


        int start = 0;
        int end = nums.length - 1;
        int startIndex = -1;
     
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                startIndex = mid;
                end=mid-1;
            }else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return startIndex;

    }

      public int lastIndex(int[] nums,int target){


        int start = 0;
        int end = nums.length - 1;
        int endIndex = -1;
     
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                endIndex = mid;
                start=mid+1;
            }else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return endIndex;

    }
}