// package GFG_Questions;
class MaximumSubarraySum
{
    public static void main(String[] args) {
        int arr[] = {1,1};
        int s = 0;
        int n = arr.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for(int i =1; i<n; i++)
        {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        } 
        // for(int i : prefixSum)
        // {
        //     System.out.println(i);
        // }

        int start = -1; int end = -1;
        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j = i; j < n; j++)
            {
                sum = prefixSum[j] - prefixSum[i] + arr[i];
                System.out.println(sum);
                if(sum == s)
                {
                    start = i; end = j;
                    break;
                }
                
            }   
            
            if(start != -1 && end != -1)
            {
                break;
            }
        }
        
        if(start != -1 && end != -1)
        {
        System.out.println((start)+" "+(end));
        }
        else
        {
            System.out.println(-1);
        }
    }
}



// class Solution
// {
//     //Function to find a continuous sub-array which adds up to a given number.
//     static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
//     {
//         ArrayList<Integer> list = new ArrayList<>();
//         int prefixSum[] = new int[n];
//         prefixSum[0] = arr[0];
//         for(int i =1; i<n; i++)
//         {
//             prefixSum[i] = prefixSum[i-1] + arr[i];
//         } 

//         int start = -1; int end = -1;
//         for(int i=0; i<n; i++ )
//         {
//             int sum = 0;
//             for(int j =i; j<n;j++)
//             {
//                 sum = prefixSum[j] - prefixSum[i] + arr[i];
//                 // System.out.println(sum);
//                 if(sum == s)
//                 {
//                     start = i; end = j;
//                     break;
//                 }
                
//             }   
            
//             if(sum == s)
//             {
//                 break;
//             }
//         }
        
        
//         if(start != -1 && end != -1)
//         {
//         list.add(start+1);
//         list.add(end+1);
//         return list;
//         }
//         else
//         {
//             list.add(-1);
//             return list;
//         }
//     }
// }