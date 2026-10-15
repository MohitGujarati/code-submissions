class Solution {
  public int subarraySum(int[] nums, int k) {

    HashMap<Long, Integer> map = new HashMap<>();
    long sum = 0;
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
//when sum is equal to k increment it 
      if (sum == k) {
        count++;
      }
//check if we already have the missing element as we did in two sum  and add number of times we have seen sum-k in past 
      if (map.containsKey(sum - k)) {
        count = count + map.get(sum - k);
      }

//record current sums frequenct in the map
      map.put(sum,map.getOrDefault(sum,0)+1);

     
    }
    return count;
  }
}