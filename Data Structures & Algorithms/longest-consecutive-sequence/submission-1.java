class Solution {
    public int longestConsecutive(int[] nums) {
      if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();


        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
       int longestStreak = 0;

        
        for (int num : set) {

            // Looking  backwards: Is this the true start of a sequence?
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Looking forwards: Follow the chain upwards
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // 6. Record the longest sequence found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}

/*
//Naive solution
      put all the elements in the hashmap or an array
      create an count variable
      then sort them iterate them start from 0 and if the previous element is +1 than its previous
element increase the count

      count = 4
      [2,20,4,10,3,4,5]
      [2,3,4,5,10,20]

//Efficent solution
  use an hashset then add elements in it
  then pick one element then ask is there +1 element in it or not if not move ahead
  if there is as again if there is an element +1 than current number


*/