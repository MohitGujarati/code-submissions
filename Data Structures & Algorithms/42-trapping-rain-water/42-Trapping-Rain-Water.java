class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        int totalWater = 0;

        // Opposite Direction Pointers moving inward
        while (left < right) {
            
            // Step the side with the smaller max inward
            if (leftMax < rightMax) {
                left++;
                // Update the max wall seen so far on the left
                leftMax = Math.max(leftMax, height[left]);
                // Calculate water trapped above the current building
                totalWater += leftMax - height[left]; 
            } else {
                right--;
                // Update the max wall seen so far on the right
                rightMax = Math.max(rightMax, height[right]);
                // Calculate water trapped above the current building
                totalWater += rightMax - height[right]; 
            }
      }

        return totalWater;
    }
}