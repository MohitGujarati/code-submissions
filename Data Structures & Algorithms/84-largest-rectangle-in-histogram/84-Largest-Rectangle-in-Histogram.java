class Solution {
  public int largestRectangleArea(int[] heights) {

      int n=heights.length;

      int[] nsl=new int[n];
      int[] nsr=new int[n];

      Deque<Integer>stack =new ArrayDeque<>();

//=========================================================================
// NEAREST Smallest to LEFT 
//=========================================================================
      for(int i=0;i<n;i++){

        while (!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
          stack.pop();
        }

//nearest smallest rule:if empty it expands all the way to index -1 
        if(stack.isEmpty()){
          nsl[i]=-1;
        }else{
          nsl[i]=stack.peek(); //
        }

        stack.push(i);
      }

//clearning stack so we can reuse 
      stack.clear();

//==============================================================================
// PHASE 2 NEAREST Smaller to RIGHT (NSR)
//==============================================================================


          for(int i=n-1;i>=0;i--){

            while(!stack.isEmpty() && heights[i]<= heights[stack.peek()]){
              stack.pop();
            }
          //If empty ,it expands past the array to index n
            if(stack.isEmpty()){
              nsr[i]=n;
            }else{
              nsr[i]=stack.peek();
            }

            stack.push(i);
          }

//=====================================================================
//PHASE 3 Calculate the max area 
//=====================================================================

int maxArea =0;

for(int i=0;i<n;i++){

  int width=nsr[i]-nsl[i]-1;
  int currentArea=heights[i]*width;

  maxArea=Math.max(maxArea,currentArea);
}

return maxArea;
                  
              }
}

/*
a building can be expand only when other building are >= current building to find that we need to find the nearest sammer to left and nearest smaller to the right nsr=5 and nsl =1 (5 and i are index ) so we will do right_index - left_index - 1 and we get 3 multiply that with 4 that gives 12 thats our max rectangle 
*/