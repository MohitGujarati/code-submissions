class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Start the first element at 1 since there is nothing to the left
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            // The left product is the previous left product * the previous number
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        int rightProduct = 1; // Start at 1 since there is nothing to the right of the last element
        
        // Loop backwards through the array
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * rightProduct;
            
            rightProduct = rightProduct * nums[i];
        }
        
        return output;
    }
}