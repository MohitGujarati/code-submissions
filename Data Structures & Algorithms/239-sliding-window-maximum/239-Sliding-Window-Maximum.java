class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {

      int n= nums.length;
      int i=0;
      int j=0;
      int [] result= new int [n-k+1];
      int max=0;
      

      Deque<Integer> deque=new ArrayDeque<>();

      while(j<n){

//cal 1
        while(!(deque.isEmpty()) && nums[deque.peekLast()]<
        nums[j]){
          //check the current max and add which ever is max from item which is in deque or current and remove the smaller one  
//It removes that smaller index from the back
          deque.pollLast();
        }
          deque.offerLast(j);
        

//cal 2
//remove the cal then i++ and j++ 
        if(j-i+1==k){

          result[i]=nums[deque.peekFirst()];

          if(deque.peekFirst()==i){
            deque.pollFirst();
          }
          i++;
          //check the current max
          //add it to result arr

        }
        j++;

      }

      return result;
        
    }
}