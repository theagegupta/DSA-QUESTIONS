class RotateMatrixBy90 {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrixBy90Degree(mat);
    }
    
    public static void rotateMatrixBy90Degree(int mat[][])
    {
        for(int i =0; i<mat.length; i++)  // rows
        {
            for(int j =i; j<mat[0].length;j++)// coloumns
            {
                if(i == j)
                {
                    // diagonal element
                    continue;
                }
                
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        for(int arr[] : mat)
        {
            int l = 0; 
            int r = arr.length-1;
            
            while(l<r)
            {
                int temp = arr[l]; 
                arr[l] = arr[r];
                arr[r] = temp; 
                l++;
                r--; 
            }
        }
        
        printMatrix(mat);
    }
    
    public static void printMatrix(int mat[][])
    {
        for(int i =0; i<mat.length; i++)
        {
            for(int j =0; j<mat[0].length; j++)
            {
                System.out.print(mat[i][j] + " "); 
            }
            System.out.println();
        }
    }
}