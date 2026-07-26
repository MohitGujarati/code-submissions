class Solution {
    //Check Again before interview !
    public int characterReplacement(String s, int k) {

    
        int[] charCounts = new int[26];

        int left = 0;
        int maxLength = 0;
        int maxFrequency = 0;

        for (int right = 0; right < s.length(); right++) {
            // 1. Get the current character and add it to our tally
            // 'A' - 'A' = 0, 'B' - 'A' = 1, etc. This maps letters to index 0-25.
            char currentChar = s.charAt(right);
            charCounts[currentChar - 'A']++;

            // 2. Check if this newly added character broke the frequency record
            maxFrequency = Math.max(maxFrequency, charCounts[currentChar - 'A']);

            // 3. The Validity Check: Replacements Needed = (Window Length) - (Max Frequency)
            // Window length is calculated by (right - left + 1)
            while ((right - left + 1) - maxFrequency > k) {
                // The window is invalid. Remove the left character from our tally and shrink.
                char leftChar = s.charAt(left);
                charCounts[leftChar - 'A']--;
                left++;
            }

            // 4. If we made it here, the window is valid. Check if it's our new maximum!
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
