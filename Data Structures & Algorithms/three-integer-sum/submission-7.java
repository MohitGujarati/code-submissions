class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length-1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[start], nums[end]);
                    
                    uniqueTriplets.add(triplet);

                    start++;
                    end--;

                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return new ArrayList<>(uniqueTriplets);

    }
}

/*

3 loops 0(n**3) 0(n) space - naive approach
 public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                        Collections.sort(triplet);

                        uniqueTriplets.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(uniqueTriplets);


//Optimized

Sort the array
Lock in the first number. Use a single for loop i.
Set up two pointers. Instead of a j and k loop, you create two variables:
left pointing to the number immediately after your anchor (i + 1).
right pointing to the very last number in the array (nums.length - 1).


*/
