import java.util.*;
import java.util.ArrayList;
public class ArrayDuplicates {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,3,3,5,66,443,7,3,64,6,5};
        Arrays.sort(arr);
        int el = arr[0];
        ArrayList<Integer> ans = new ArrayList<Integer>(); 
        int count = 1;
        for(int i =1; i < arr.length; i++)
        {
            if(arr[i] == el)
            {
                count++;
            }
            
            else if (arr[i] != el)
            {
                if(count >= 2)
                ans.add(arr[i-1]);
                
                count = 1; 
                el = arr[i];
            }
        }
        
        for (int i:ans)
        {
            System.out.println(i);
        }
    }
}
