class Solution {
  public boolean isHappy(int n) {

    int slow = n;
    int fast = n;

    do {

      slow = findSqure(slow);
      fast = findSqure(findSqure(fast));

    } while (slow != fast);

    if (slow == 1) {
      return true;
    }
    return false;

  }

  private int findSqure(int num) {
    int ans = 0;

    while (num > 0) {
      int rem = num % 10;
      ans = ans + rem * rem;
      num /= 10;
    }

    return ans;
  }
}