class Solution {
  public int[] nextGreaterElements(int[] nums) {

    int n=nums.length;

    int[] result = new int[n];
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 2*n-1 - 1; i >= 0; i--) {

      int actualIndex=i%n;

      while (!stack.isEmpty() && stack.peek() <= nums[actualIndex]) {
        stack.pop();
      }
      if(stack.isEmpty()){
        result[actualIndex]=-1;
      }else{
        result[actualIndex]=stack.peek();
      }

      stack.push(nums[actualIndex]);

    }

    //Collections.reverse(result);

    return result;

  }
}