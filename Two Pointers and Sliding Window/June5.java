// count all substrings that contains a, b ,c atleast once

class June5 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String str = "aaabbbcbabc";
        System.out.println(sol.countSubstring(str));
    }
}

class Solution {
    public int countSubstring(String s) {
        // code here

        int lastSeen[] = new int[3];

        for (int i = 0; i < 3; i++) {
            lastSeen[i] = -1;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            lastSeen[s.charAt(i) - 'a'] = i;

            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                // all 3 characters are present
                count += 1 + Math.min(Math.min(lastSeen[0], lastSeen[1]), lastSeen[2]);
            }
        }

        return count;
    }
}