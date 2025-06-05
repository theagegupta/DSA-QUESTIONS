// package questions.PatternPrinting;

public class Practice {
public static void main(String[] args) {
 int arr[] = {2,3,-1,-3,5,7,7,-4};
    // Kadence algorithm to find the maximum subarray sum
    int currSum = 0;
    int maxSum =0;
     for(int i = 0; i<arr.length; i++)
     {
        currSum = currSum + arr[i];
         maxSum = Math.max(maxSum,currSum);

         if(currSum<0)
         {
            currSum = 0;
         }
     }
     System.out.println("Maximums subarray sum is:"+maxSum);
}
}
