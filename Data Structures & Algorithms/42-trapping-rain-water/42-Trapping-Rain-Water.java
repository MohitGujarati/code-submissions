class Solution {
  public int trap(int[] height) {
        int totalWater = 0;
        
        // 1. Initialize your Monotonic Stack engine to store INDICES[cite: 2]
        Deque<Integer> stack = new ArrayDeque<>(); 

        // 2. Iterate through every building
        for (int i = 0; i < height.length; i++) {
            
            // 3. THE PUDDLE ENGINE: While we find a taller Right Wall
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                
                // Pop the shorter building (This is the Bottom of the puddle)
                int bottom = stack.pop(); 
                
                // If the stack is empty, there is no Left Wall to hold the water! 
                // It just spills out, so we break out of the while loop.
                if (stack.isEmpty()) {
                    break;
                }
                
                // The new top of the stack is guaranteed to be our Left Wall
                int leftWall = stack.peek();
                
                // 4. Calculate dimensions of this specific horizontal layer
                int width = i - leftWall - 1;
                int puddleHeight = Math.min(height[i], height[leftWall]) - height[bottom];
                
                // 5. Add the trapped water for this layer to the total
                totalWater += width * puddleHeight;
            }
            
            // 6. Push the current index onto the stack to act as a potential wall for future buildings[cite: 2]
            stack.push(i); 
        }

        return totalWater;
  }
}