 class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        // Solution sol = new Solution();
        String str = "ABCAADBAB";
        int k = 3; 
        System.out.println(Solution.characterReplacement(str,k)); 

    }
}


class Solution {
    static int characterReplacement(String s, int k) {
        
        int l = 0; 
        int r =0; 
        int maxLen = 0; 
        int Hash[] = new int[26];  // stores the frequency of each character
        int maxFreq = 0; 
        while(r<s.length())
        {
            Hash[s.charAt(r) - 'A']++; 
            
            maxFreq = Math.max(maxFreq, Hash[s.charAt(r) - 'A']); 
            int conversions = r-l+1 - maxFreq; 
            
            if(conversions > k) // window shrink
            { 
                Hash[s.charAt(l) - 'A']--; 
                l++; 
            }
          
            
            if(conversions<= k)
            {
                maxLen = Math.max(maxLen, r-l+1); 
            }
            
            r++; 
        }
        return maxLen; 
    }
}
