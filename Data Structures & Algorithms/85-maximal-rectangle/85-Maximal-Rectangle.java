class Solution {
    public int maximalRectangle(char[][] matrix) {
          // Edge Case Safety Check from your Matrix Search practice[cite: 3]
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int cols = matrix[0].length;
        
        // This is the 1D array that will act as the ground floor for our MAH engine
        int[] heights = new int[cols];
        int globalMaxArea = 0;
        
        // Loop through the 2D matrix row by row
        for (int i = 0; i < matrix.length; i++) {
            
            // Build the histogram for the current row
            for (int j = 0; j < cols; j++) {
                // If the cell is '1', the building grows. 
                // Note: The matrix contains characters, so we check for '1', not the integer 1.
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } 
                // If the cell is '0', the building's foundation is destroyed and it collapses to 0.
                else {
                    heights[j] = 0;
                }
            }
            
            // Send the newly updated 1D array into the MAH engine!
            int currentArea = largestRectangleArea(heights);
            
            // Track the absolute highest score we find across all rows
            globalMaxArea = Math.max(globalMaxArea, currentArea);
        }
        
        return globalMaxArea;
    }
    
    // =====================================================================
    // YOUR MAH ENGINE (Largest Rectangle in Histogram)
    // =====================================================================
    private int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsl = new int[n];
        int[] nsr = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        
        // Phase 1: Nearest Smaller to Left (NSL)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1; // Boundary trap fix for Left
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        
        stack.clear(); // Clear stack for Phase 2
        
        // Phase 2: Nearest Smaller to Right (NSR)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = n;  // Boundary trap fix for Right
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
      }
        
        // Phase 3: Calculate Max Area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}