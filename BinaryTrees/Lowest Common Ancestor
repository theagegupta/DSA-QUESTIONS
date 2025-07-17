
class Solution {
    // Function to return the lowest common ancestor in a Binary Tree.
    Node lca(Node root, int n1, int n2) {
        
        // Stack<Node> p1 = new Stack<>(); 
        // Stack<Node> p2 = new Stack<>(); 
        
        ArrayList<Node> p1 = new ArrayList<>(); 
        ArrayList<Node> p2 = new ArrayList<>(); 
        
        path(root, n1, p1);
        path(root, n2, p2);
        
        int i =0; 
        for(; (i<p1.size() && i<p2.size()); i++)
        {
            if(p1.get(i) != p2.get(i))
            {
                break; 
            }
        }
        
        return p1.get(i-1);
    }
    
    boolean path(Node root, int k, ArrayList<Node> p)
    {
        
        if(root == null)
        {
            return false; 
        }
        
        p.add(root); 
        
        if(root.data == k)
        {
            return true; 
        }
        

       if(path(root.left, k, p) || path(root.right, k, p))
       {
           return true; 
       }
      
      p.remove(p.size()-1); 
      return false; 
    }
}
