// package GFG_Questions;
import java.util.*;
class CoMoNElEmEnTs{
    public ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        ArrayList<Integer> common = new ArrayList<>();
        // int maxLen = Math.max(v1.length, v2.length);
        // int minLen = Math.min(v2.length,v1.length);
        for(int i = 0; i<v1.length; i++)
        {
            for(int j = 0; j<v2.length; j++)
            {
                if(v1[i]==v2[j]) common.add(v1[i]);
            }
        }
        Collections.sort(common);
        return common;
    }

    public static void main(String[] args) 
{
        int v1[] = {2,6,3,4,6,7,8,4,7};
        int v2[] = {2,6,3,6,2,8,4,7,3,7,2,8};
        Solution2 s = new Solution2();
        CoMoNElEmEnTs s1 = new CoMoNElEmEnTs();
    
        ArrayList<Integer> result = s.common_element(v1, v2);
        System.out.println(result);
        
        System.out.println(s1.common_element(v1,v2));
}
}

class Solution2{
    public ArrayList<Integer> common_element(int v1[], int v2[])
    {
        // Sort both arrays
        Arrays.sort(v1);
        Arrays.sort(v2);

        ArrayList<Integer> common = new ArrayList<>();
        
        // Two pointers for the two arrays
        int i = 0, j = 0;
        
        // Iterate until either array is fully traversed
        while (i < v1.length && j < v2.length) {
            if (v1[i] == v2[j]) {
                // If elements are equal, add to common and move both pointers
                common.add(v1[i]);
                i++;
                j++;
            } else if (v1[i] < v2[j]) {
                // If v1's element is smaller, move v1's pointer
                i++;
            } else {
                // If v2's element is smaller, move v2's pointer
                j++;
            }
        }
        
        return common;
    }
}