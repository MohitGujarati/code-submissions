class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
       // Step 1: Split (Convert string to a character array)
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();

        // Step 2: Sort (This changes the arrays in place)
        Arrays.sort(s_chars);
        Arrays.sort(t_chars);

        // Step 3 (Optional): Just rename them for your loop if you want to!
        char[] s_sorted = s_chars;
        char[] t_sorted = t_chars;

        for (int i = 0; i < s.length(); i++) {
            if (s_sorted[i] == t_sorted[i]) {

            }
            else {
                return false;
            }
        }
    return true;
}
}

    
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
