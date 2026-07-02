class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> outputnums = new ArrayList<>();

        boolean flag = false;

        for (int i = 0; i < nums1.length; i++) {
            flag = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag && !outputnums.contains(nums1[i])) {
                outputnums.add(nums1[i]);
            }
        }
        // Create an array of the correct size
        int[] result = new int[outputnums.size()];

        // Copy values from ArrayList to array
        for (int i = 0; i < outputnums.size(); i++) {
            result[i] = outputnums.get(i);
        }

        return result;
        
    }
}
/*
        // Store the common numbers
            // Compare with every number in nums2
// Add only if:F
            // 1. It was found in nums2
            // 2. It is not already in the result

        // Create an array of the correct size
        // Copy values from ArrayList to array
        // Return the final array


*/