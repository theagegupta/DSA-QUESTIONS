// package questions.PatternPrinting;

public class FloydsTriangle {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 0; i<=5; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
           
        }
    }
}
