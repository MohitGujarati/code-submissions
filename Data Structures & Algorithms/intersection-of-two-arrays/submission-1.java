class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<>();

        ArrayList<Integer> outputnums = new ArrayList<>();

        
        for (int i = 0; i < nums1.length; i++) {
            nums.add(nums1[i]);
        }

        // Second loop: check nums2
        for (int i = 0; i < nums2.length; i++) {
            if (nums.contains(nums2[i]) && !outputnums.contains(nums2[i])) {
                outputnums.add(nums2[i]);
            }
        }

        int[] result = new int[outputnums.size()];
        // Copy values from ArrayList to array
        for (int i = 0; i < outputnums.size(); i++) {
            result[i] = outputnums.get(i);
        }

        return result;
    }
}

/*

add all the elemets of nums2 into an hashmap

then loop through the elements of nums1 and check if it present in the hashmap of nums2

if it is return them in that order



*/

// Naive
/*
        // Store the common numbers
            // Compare with every number in nums2
// Add only if:F
            // 1. It was found in nums2
            // 2. It is not already in the result

        // Create an array of the correct size
        // Copy values from ArrayList to array
        // Return the final array

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

*/