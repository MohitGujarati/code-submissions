class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = (rows * cols) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Translate the 1D 'mid' back into 2D coordinates
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            }

            if (midValue > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}

/*
method with extra space 

first instert them into normal array
then perform binary search

ArrayList<Integer> arr = new ArrayList<Integer>();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr.add(matrix[i][j]);
            }
        }

        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return true;
            }

            if (arr.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
*/