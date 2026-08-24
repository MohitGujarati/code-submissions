class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int output = 0;

        while (start < end) {
            int currentResult = 0;
            int distance = end - start;
            int minHeight = Math.min(heights[start], heights[end]);

            currentResult = distance * minHeight;
            output = Math.max(output, currentResult);

            if (heights[start] < heights[end]) {
                start++;

                distance = start - end;

                currentResult = distance * minHeight;
                output = Math.max(output, currentResult);
            } else {
                end--;

                distance =   end - start;

                currentResult = distance * minHeight;
                output = Math.max(output, currentResult);
            }

        }
        return output;
    }
}

/*
Input: height = [1,7,2,5,4,7,3,6]

Output: 36

first take two pointer start and end then add loop that checcks if the start is smaller than end

if start is smaller we move it ahead if end is samller we move it inward but before what we
calculate distance between index (7-1) = 6 and then take min height by doing
min(height[start],height[end]) and move ahead either inward or in incremental way so current result
will be distance*height

and return max value by max(output,current)


*/
