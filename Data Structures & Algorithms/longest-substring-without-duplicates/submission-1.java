class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLength=0;

        HashSet<Character> stringSet = new HashSet<Character>();

        while (right<s.length()) {

            if(!stringSet.contains(s.charAt(right))){
                stringSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, stringSet.size());
                right++;

            }else{
                stringSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}

/*

Take a hashSet loop it thought till start pointer reachers the end 
if we dont have the element add it and increase the count then go ahead right++
if we already have just remove the left pointer then go ahead left++ untill we reach to the current pointer 
and return the max length

*/