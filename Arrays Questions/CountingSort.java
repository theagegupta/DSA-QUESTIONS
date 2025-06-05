import java.util.*;
class CountingSort {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,4,6,5,3,6,5,4,3,2,1,6,7,8,9,10,10,2,3,4,5,6};
        // we use counting sort when we have limited range of numbers
        int max = 10;
        int count[] = new int[max+1];

        for(int i = 0; i< arr.length; i++)
        {
            count[arr[i]]++;
        }

        int index = 0;
        for(int i =0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                arr[index] = i;
                count[i]--; 
                index++;
            }
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }

        sc.close();
    }
}
