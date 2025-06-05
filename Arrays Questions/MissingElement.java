// package GFG_Questions;
import java.util.*;
public class MissingElement {
        public static int missingNumber(int array[], int n) {
            // Find the missing element in the given array 
            // Your Code Here
            Arrays.sort(array);
        //     for(int i : array)
        //     {
        //     System.out.println(i);
        // }                   
            // int missing = 0; 
            for(int i = 0; i<n-1; i++)
            {
                if((i+1) != array[i]) return (i+1); 
            }
        
            return (n);
        }
        

        public static int method2(int arr[], int n)
        {
                int sum = n*(n+1)/2;
                int arrSum=0;
                for(int i : arr)
                {
                    arrSum += i;
                }

                return (sum - arrSum);
        }
        public static void main(String[] args) {
            int array[] = {4,6,7,8,2,3,1,9,10};
            int n = 10;
            System.out.println("Method 1: "+missingNumber(array, n));
            System.out.println("Method 2:"+method2(array, n));
        }
    }

