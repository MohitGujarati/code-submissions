class Solution {
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
}

/*

naive
2 loops ,pointer one i and j ,if i+j == return index of i and j

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

efficient
i will use hash map ,put all elements in it then check if the value will be
key is the number ,value is the index
return values

*/