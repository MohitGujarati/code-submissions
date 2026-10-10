class Solution {
  public long maximumSubarraySum(int[] nums, int k) {

    int size = nums.length;
    int i = 0;
    int j = 0;

    int maxSum = 0;
    int sum = 0;

    HashSet<Integer>seen =new HashSet<>();

    while (j < size) {


      while(seen.contains(nums[j])){
        sum=sum-nums[i];
        seen.remove(nums[i]);
        i++;
      }

      sum=sum+nums[j];
      seen.add(nums[j]);
    if (j - i + 1 == k) {
        maxSum = Math.max(maxSum, sum);
        sum = sum - nums[i];
        j++;
        i++;
      }
      else{
        j++;
      }
    }

    return maxSum;

  }
}