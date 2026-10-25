class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

      int n=temperatures.length;

      Deque<Integer>Stack=new ArrayDeque<>();
      int[] days=new int [n];


      for(int i =0;i<n;i++){

        while(!Stack.isEmpty() && temperatures[i]>temperatures[Stack.peek()]){
          int popedIndex=Stack.pop();
          days[popedIndex]=i-popedIndex;
        }
        
        Stack.push(i);

      }
      return days;
        
    }
}