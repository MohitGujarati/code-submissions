class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.toLowerCase();

        int start =0;
        int end = newString.length()-1;

        while (start < end) {
            // 1. Skip non-alphanumeric characters from the left
            while (start < end && !Character.isLetterOrDigit(newString.charAt(start))) {
                start++;
            }
            
            // 2. Skip non-alphanumeric characters from the right
            while (start < end && !Character.isLetterOrDigit(newString.charAt(end))) {
                end--;
            }
            
            if (newString.charAt(start) == newString.charAt(end)) {
                start++;
                end--;

            } else {
                return false;
            }
        }

        return true;
    }
}
