class Solution {
    public int[] twoSum(int[] nums, int target) {

      int start=0;
      int end =nums.length-1;

      while(start<end){

        int current=nums[start]+nums[end];

        if(current==target){
          return new int[]{start+1,end+1};
        }

        if(current>target){
          end--;
        }else{
          start++;
        }
      }
      return new int[]{};
    }
}