class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

      for (int num : nums) {
        //if we dont add the add number it means its already present 
           if(!seen.add(num)){
            return true;
           }
        }

        return false;
    }
}
