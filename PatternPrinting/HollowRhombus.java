// package questions.PatternPrinting;

public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<= n; i++)    // initializer ..... condition .... updation
        {
//             outer for loop to change the line
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <=n ; k++)
            {
                if(i == 1 || i==n || (k== 1 || k == n))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
//                inner for loop for the main task
        }
    }
}
