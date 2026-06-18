class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> myMap_s = new HashMap<>();
        HashMap<Character, Integer> myMap_t = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);
            myMap_s.put(char_s, myMap_s.getOrDefault(char_s, 0) + 1);
            myMap_t.put(char_t, myMap_t.getOrDefault(char_t, 0) + 1);
        }

        return myMap_s.equals(myMap_t);
    
    //     // Step 1: Split (Convert string to a character array)
    //     char[] s_chars = s.toCharArray();
    //     char[] t_chars = t.toCharArray();

    //     // Step 2: Sort (This changes the arrays in place)
    //     Arrays.sort(s_chars);
    //     Arrays.sort(t_chars);

    //     // Step 3 (Optional): Just rename them for your loop if you want to!
    //     char[] s_sorted = s_chars;
    //     char[] t_sorted = t_chars;

    //     for (int i = 0; i < s.length(); i++) {
    //         if (s_sorted[i] == t_sorted[i]) {

    //         }
    //         else {
    //             return false;
    //         }
    //     }
    // return true;
}
}
