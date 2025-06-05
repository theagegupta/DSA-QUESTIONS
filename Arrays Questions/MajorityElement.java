// package GFG_Questions;

public class MajorityElement {
    public static void main(String[] args) {
        // int arr[] = { 6, 5, 4, 6, 6, 3, 6, 6, 9, 6};      // will give -1 output
        int a[] = {1,2,3,5,5,5,5,5,6};
        int count = 1;
        int majority = a[0];

        // the below solution will only work when the array is sorted 
        for (int i = 1; i < a.length; i++) 
        {
            if (a[i] == majority) {
                count++;
            }

            else {
                if (count > ((a.length) / 2)) {
                    break;
                }

                else {
                    majority = a[i];
                    count = 1;
                }
            }
        }

        if (count > ((a.length) / 2)) 
        {
            System.out.println("Majority element is: " + majority);
        }

        else
        {
            System.out.println("Not Majority element: -1");
        }
    }
}
