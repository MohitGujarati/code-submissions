class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map=new HashMap();

        for( int i=0;i<nums.length;i++){

            int diffrence = target-nums[i];


//loop thorugh if we have diffrence retun it or else put it 
             if(map.containsKey(diffrence)){
                return new int[] {map.get(diffrence),i};
             }
//put it when not present 
                map.put(nums[i], i);
        }

            return new int[] {};
    

    }
}
