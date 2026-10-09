class Solution {
    public int maxArea(int[] height) {


      int start=0;
      int end =height.length-1;

      int maxarea=0;

      while(start<end){
      int   currentArea =(end-start)*Math.min(height[start],height[end]);

      maxarea=Math.max(maxarea,currentArea);


        if(height[start]<height[end]){
          start++;
        }else{
          end--;
        }
      }
      return maxarea;
    }
}

/*

two pointer start and end 

subtract start and end get the absolute(non-negative) value // or according to this we can just multiple the pointer and then  save it in variable , calulate use that math.max to keep the max value check while(start<end)

taller one remains at its place while lower moves inward 

*/