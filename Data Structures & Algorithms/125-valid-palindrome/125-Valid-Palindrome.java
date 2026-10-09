class Solution {
  public boolean isPalindrome(String s) {

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {


//skip if it not a letter or digit
      while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      }
      while (left<right && !Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      }
//return false if not equal
      if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        return false;
      }
      left++;
      right--;

    }
    return true;

  }
}