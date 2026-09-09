class Solution {
    public boolean isSubsequence(String s, String t) {
        // two pointer approach ,
        // 1 charAt s (i) charAt t (j) if s and t matches move both ahead
        // if they dont move only j ahead

        if (s.length() > t.length()) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i==s.length();
    }
}