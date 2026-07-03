class Solution {
    public int findMin(int[] nums) {


        //return index of min element thats it 
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            }

            else {
                high = mid;
            }
        }

        return nums[low];
    }
}

/*

Normal binary while loop 
if mid is smaller then high 
low =mid+1 else high =mid

return nums[low] at the end 


*/