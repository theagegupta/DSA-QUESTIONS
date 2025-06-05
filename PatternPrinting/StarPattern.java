// package questions.PatternPrinting;
public class StarPattern {
    public static void main(String args[])
    {
        // for(int i = 0; i < 5; i++)
        // {
        //     for(int j = 0; j< i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();


        // Inverse Star Pattern
        int n = 5; 
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

