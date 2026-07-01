class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

     
        HashMap<Character, Integer> mapOne = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            mapOne.put(c, mapOne.getOrDefault(c, 0) + 1);
        }
        int left = 0; 
        int right = 0;
        int matched = 0;
        while (right < s2.length()) {
            char rightChar = s2.charAt(right);

            if (mapOne.containsKey(rightChar)) {
                mapOne.put(rightChar, mapOne.get(rightChar) - 1);

                if (mapOne.get(rightChar) == 0) {
                    matched++;
                }
            }

            if (right - left + 1 > s1.length()) {
                char leftChar = s2.charAt(left);

                if (mapOne.containsKey(leftChar)) {
                    if (mapOne.get(leftChar) == 0) {
                        matched--;
                    }
                    mapOne.put(leftChar, mapOne.get(leftChar) + 1);
                }
                left++;
            }
            if (matched == mapOne.size()) {
                return true;
            }

            right++;
        }

        return false;
    }
}
