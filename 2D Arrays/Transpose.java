import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // columns

        int mat[][] = new int[m][n];
        int trans[][] = new int[n][m];

        // taking the array input
        for(int i = 0; i<m; i++ )
        {
            for(int j = 0; j<n; j++)
            {
                mat[i][j] = sc.nextInt();
                trans[j][i] = mat[i][j];
            }
        }

        System.out.println("Original  matrix is: ");
        printMat(mat);
        System.out.println("Transpose matrix is: ");
        printMat(trans);

        sc.close();

    }

    public static void printMat(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
