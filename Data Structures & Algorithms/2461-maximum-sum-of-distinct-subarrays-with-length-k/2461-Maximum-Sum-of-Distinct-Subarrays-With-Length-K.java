class Solution {
  public long maximumSubarraySum(int[] nums, int k) {

    int size = nums.length;
    int i = 0;
    int j=0;
   

    long maxSum = 0;
    long  sum = 0;

    HashSet<Integer> seen = new HashSet<>();

    while ( j < nums.length) {

      while (seen.contains(nums[j])) {

        seen.remove(nums[i]);
        sum = sum - nums[i];
        i++;
      }

      seen.add(nums[j]);
      sum = sum + nums[j];

      if (j - i + 1 == k) {
        maxSum = Math.max(maxSum, sum);
        seen.remove(nums[i]);
        sum = sum - nums[i];
        
        i++;
      }

      j++;
      
    }

  return maxSum;

}}