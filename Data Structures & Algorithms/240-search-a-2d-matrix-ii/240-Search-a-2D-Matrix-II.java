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
//current at the end of first row 
      int current = matrix[row][col];

//check if it same 
      if (current == target) {
        return true;
      } else if (current > target) { //if the current is grater all in the col are greter so now 
        col--;
      } else {
        row++;
      }
    }

    return false;
  }
}