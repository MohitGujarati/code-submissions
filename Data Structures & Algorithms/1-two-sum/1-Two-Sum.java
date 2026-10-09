class Solution {
  public int[] twoSum(int[] nums, int target) {
        //creating hashmap to store the

        Map<Integer,Integer> map=new HashMap<>();

         //itrating
        for(int i=0;i<nums.length;i++){

            //calculating the the remaining by subtracting 
            int complement=target-nums[i];
       
            //check if the complement is already in map
        if(map.containsKey(complement)){
             //if found redturn indices
            return new int[]{ map.get(complement),i}; 
        }
        else{
                //if not found add
                map.put(nums[i],i);

            }
        }

        return new int[]{};
    }

}

