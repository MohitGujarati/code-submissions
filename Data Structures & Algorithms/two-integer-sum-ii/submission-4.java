class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

            while (start < end) {
            int mid = numbers[start] + numbers[end];

            if (mid == target) {
                return new int[] {start + 1, end + 1};
            } else {
                if (mid < target) {
                    start ++;
                }else{
                    end--;
                }
            }
        }
        return new int[]{};
    }
}

/*

naive
2 loops ,pointer one i and j ,if i+j == return index of i and j
Time complexity: 0(n**2) and space 0(1)
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

// efficient
i will use hash map ,put all elements in it then check if the value will be
key is the number ,value is the index
return values
Time complexity: 0(n) and space 0(n)

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            int targetNum = target - numbers[i];
            if (hashmap.containsKey(targetNum)) {
                return new int[] {hashmap.get(targetNum) + 1, i + 1};

            } else {
                hashmap.put(numbers[i], i);
            }
        }

        return new int[] {};
    }

most efficient way - semi Binary search

*/