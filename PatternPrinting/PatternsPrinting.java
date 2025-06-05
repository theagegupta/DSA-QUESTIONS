// package questions.PatternPrinting;

public class PatternsPrinting 
{
    public static void main(String args[])
    {
        hollowRectange(10,7);
        System.out.println();
        invertedHalfPyramid();
    }

    public static void hollowRectange(int row, int coloumn)
    {
        //  To print a hollow triangle
        for(int  i = 1; i <= row; i++)
        {
            for(int j = 1; j <= coloumn; j++)
            {
                if(i == 1 || i == row || j ==1 || j == coloumn)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid()
    {
        int num = 5; 
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= num; j++)
            {
                if(j<num -i +1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
