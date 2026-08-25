class Solution {

                                    //NEED TO DO THIS AGAIN 

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        // Ensure nums1 is always the smaller array to prevent out-of-bounds errors
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int len1 = nums1.length;
        int len2 = nums2.length;

        // Binary search boundaries for the smaller array
        int low = 0; 
        int high = len1;

        while (low <= high) {
            // "partition" represents where we draw the line to split the arrays in half
            int partition1 = (low + high) / 2;
            int partition2 = ((len1 + len2 + 1) / 2) - partition1;

            // Get the edge values around the partition in the first array
            int leftMax1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int rightMin1 = (partition1 == len1) ? Integer.MAX_VALUE : nums1[partition1];

            // Get the edge values around the partition in the second array
            int leftMax2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int rightMin2 = (partition2 == len2) ? Integer.MAX_VALUE : nums2[partition2];

            // Check if we have successfully split both arrays into valid left and right halves
            if (leftMax1 <= rightMin2 && leftMax2 <= rightMin1) {
                
                // If the total number of elements is even, the median is the average of the two middle elements
                if ((len1 + len2) % 2 == 0) {
                    return ((double) Math.max(leftMax1, leftMax2) + Math.min(rightMin1, rightMin2)) / 2;
                } 
                // If the total number of elements is odd, the median is the largest element on the left
                else {
                    return (double) Math.max(leftMax1, leftMax2);
                }
                
            } 
            // If the left element in nums1 is too big, move the binary search to the left
            else if (leftMax1 > rightMin2) {
                high = partition1 - 1;
            } 
            // If the left element in nums1 is too small, move the binary search to the right
            else {
                low = partition1 + 1;
            }
        }

        return -1;
    }
}

/*
naive
create an array temp[] of size (n1+n2)
copy elements of a1[] and a2[] to tempp[]
sort temp[]
if (n1+n2) is odd then return middle of temp
else return the avg of the middle two elements
*/