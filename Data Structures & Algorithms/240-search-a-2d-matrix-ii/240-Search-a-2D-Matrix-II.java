class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {

//if length zero return false
    if (matrix == null || matrix.length == 0 ||
        matrix[0].length == 0) {
      return false;
    }

//row starting point and col at the end of 1st row
    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
//current at the end of first row so we are at 15
      int current = matrix[row][col];

//return if current is same as target
      if (current == target) {
        return true;
      } else if (current > target) { //if the current is grater all in the col are greter so now 15,19,..30 are skiped and we will be at 11 same continues 
        col--;
      } else {//onces we are at 4 current is smaller than 5 so skip the row and we end up on our target 5
        row++;
      }
    }

//return false if not found 
    return false;
  }
}