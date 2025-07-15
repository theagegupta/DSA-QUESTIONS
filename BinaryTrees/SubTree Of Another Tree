
class Solution {
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        
        if(T==null)
        {
            return false; 
        }
        
        if(T.data == S.data)  // sub root found
        {
            if(identical(T,S))
            {
                return true; 
            }
        }
        
        return isSubtree(T.left, S) || isSubtree(T.right, S); 
    }
    
    public static boolean identical(Node T, Node S)
    {
        if((T == null && S == null))
        {
            return true; 
        }
        
        else if(T == null || S == null || T.data != S.data)
        {
            return false; 
        }
        
        return identical(T.left, S.left) && identical(T.right, S.right); 
    }
}
