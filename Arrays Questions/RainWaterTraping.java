// package GFG_Questions;
// gfg 
public class RainWaterTraping {

    static long trappingWater(int arr[], int n) {
        int water = 0;
        int i = 1;
        // System.out.println("hello1");
        while ((i < n - 1) && (n > 3)) {

            int j = i - 1;
            int start = arr[i];
            while (j >= 0) {
                if (arr[j] > start) {
                    start = arr[j];
                    // System.out.println("Start wala loop. Start: "+start);
                }
                j--;
            }

            int k = i + 1;
            int end = arr[i];
            while (k <= n - 1) {
                if (arr[k] > end) {
                    end = arr[k];
                    // System.out.println("End wala loop End:"+end);
                }
                k++;
            }

            if (start != arr[i] && end != arr[i]) {
                water += waterStored(start, end, arr);
            }

            i = indexOf(arr, end) + 1;
        }
        return water;
    }

    static int waterStored(int start, int end, int arr[]) {
        int level = Math.min(start, end);
        int totalWater = 0;
        for (int i = indexOf(arr, start) + 1; i < indexOf(arr, end); i++) {
            totalWater = totalWater + level - arr[i];
        }
        return totalWater;
    }

    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; // If element is not found
    }

    public static int DidiApproach(int arr[], int n) {
        int leftMax[] = new int[n]; // auxiliary array to store left max boundary of a bar
        int rightMax[] = new int[n]; // aurx array to store right max boundary of a bar

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (leftMax[i - 1] > arr[i]) {
                leftMax[i] = leftMax[i - 1];
            }

            else {
                leftMax[i] = arr[i];
            }
        }

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (rightMax[i + 1] > arr[i]) {
                rightMax[i] = rightMax[i + 1];
            }

            else {
                rightMax[i] = arr[i];
            }
        }

        // now we will create a loop to find the water level of each bar
        int water = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            // System.out.println(water);
            water = water + (waterLevel - arr[i]);
        }

        return water;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Hello");
        System.out.println("Traped water is: " + trappingWater(arr, arr.length));
        System.out.println("Didi's approach answer: " + DidiApproach(arr, arr.length));
    }
}