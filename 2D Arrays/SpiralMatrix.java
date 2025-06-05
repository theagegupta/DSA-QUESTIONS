import java.util.Scanner;
class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];
        // int value = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral pattern");

        int track = 0;
        
        int k = 17;

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i; j < arr.length - i; j++) {
                System.out.print(arr[i][j] + " ");
                track++;
                if(track == k) System.out.println("Found");
            }
            
            // System.out.println();
            
            for (int j = i + 1; j < arr[0].length - 1 - i; j++) {
                System.out.print(arr[j][arr[0].length - 1 - i] + " ");
                track++;
                if(track == k) System.out.println("Found");
            }
            
            for (int j = arr.length - 1 - i; j > i; j--) {
                System.out.print(arr[arr[0].length - 1 - i][j] + " ");
                track++;
                if(track == k) System.out.println("Found");
            }
            
            for (int j = arr[0].length - 1 - i; j > i; j--) {
                System.out.print(arr[j][i] + " ");
                track++;
                if(track == k) System.out.println("Found");
            }

            System.out.println("\n" + track);
            sc.close();
        }
    }
}