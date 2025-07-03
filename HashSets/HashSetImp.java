import java.util.*; 
public class HashSetImp {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("Jhansi"); 
        set.add("Delhi"); 
        set.add("Bhopal"); 
        set.add("Muradabad");
        
        // iterating over a set
        // 2 ways to do this - 1. Using an iterator , 2. Using a for loop 

        // Mehtod 1 
        System.out.println("Using for loop");
        for (String string : set) {
            System.out.println(string);
        }

        // Method 2 - Using an iterable

        Iterator it = set.iterator();   
        
        System.out.println("\nUsing iterator");
        while(it.hasNext())
        {
            System.err.println(it.next());
        }

        

        

    }
}
