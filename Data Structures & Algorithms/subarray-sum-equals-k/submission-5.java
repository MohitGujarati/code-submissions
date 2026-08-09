class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int prefixSum = 0;
        int totalSubarrays = 0;
        map.put(0, 1);

        for (int num : nums) {
            // calculate running total
            prefixSum += num;

            // if present add number of times we have seen it to the total
            if (map.containsKey(prefixSum - k)) {
                totalSubarrays += map.get(prefixSum - k);
            }

            // if we haven't seen it,add or if we have seen it increment its count;
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return totalSubarrays;
    }
}

/*

Naive

2 loop i and j
take an variable as current sum and maxSubarray

if(currentsum == k){
maxSubarray++
}

at the end return maxSubarray

//Code

    public int subarraySum(int[] nums, int k) {

        int maxSubarray = 0;

        for (int i = 0; i < nums.length; i++) {
             int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if (currentSum == k) {
                    maxSubarray++;
                }
            }
        }

        return maxSubarray;
    }


*/