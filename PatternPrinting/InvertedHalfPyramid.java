// package questions.PatternPrinting;

public class InvertedHalfPyramid {
    public static void main(String args[])
    {
        for(int i = 1; i <= 4; i++)
        {
            // for(int j = 1; j <= 4; j++)
            // {
                
            // }
            for(int k = 1; k <= 4 -i; k++)
            {
                System.out.print(" ");
            }
            for(int L = 4; L > 4-i; L--)
            {
                System.out.print("*");
            }
         System.out.println();
        }
    }
}
