class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length;

       

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }
}

// naive
// 2 loops ,pointer one i and j ,if i+j == return index of i and j

// efficient
// i will use hash map ,put all elements in it then check if the value will be
// key is the number ,value is the index
// return values