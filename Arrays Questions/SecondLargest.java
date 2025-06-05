// package GFG_Questions;

public class SecondLargest {
    public static void main(String[] args) {
        // int arr[] = {4,5,6,3,1,50,52,5,7,100};
        int arr[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int max = arr[0];
        int max2 = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
            // case when the current element is smaller than max but greater than max2
            else if(arr[i]!=max) {
                max2 = Math.max(max2, arr[i]);
            }

        }
        if(max2 < 0)
        {
            System.out.println("There is not second largest element.");
        }
        else
        {
            System.out.println("2nd largest element is:" + max2);
        }
    }
}
