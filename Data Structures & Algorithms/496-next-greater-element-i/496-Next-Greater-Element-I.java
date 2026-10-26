class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {

    int[] result = new int[nums1.length];
    Deque<Integer> Stack = new ArrayDeque<>();

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums2.length; i++) {

      while (!(Stack.isEmpty()) &&
          (nums2[i] > Stack.peek())) {
        int poped = Stack.pop();
        map.put(poped, nums2[i]);

      }

      Stack.push(nums2[i]);
    }

    for (int i = 0; i < nums1.length; i++) {

      int ans = map.getOrDefault(nums1[i], -1);
      result[i] = ans;
    }

    return result;

  }
}