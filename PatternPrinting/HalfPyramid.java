// package questions.PatternPrinting;
class HalfPyramid 
{
    public static void main(String args[])
    {
        // Print the half pyramid pattern
        char ch = 'A';
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
   
}