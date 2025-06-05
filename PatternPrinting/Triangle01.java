// package questions.PatternPrinting;

public class Triangle01 
{
    public static void main(String args[])
    {
       

        // KHUDH SE KIYA HUA METHOD
       /*  int n = 1;
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if(i%2 != 0)
                {
                        if(j%2 != 0)
                        {
                            System.out.print(n);
                            n--;
                        }
                    else
                        {   
                
                        System.out.print(n);
                        n++;
                        }   
                }
                else
                {
                    if(j%2 != 0)
                    {   
                        n--;
                        System.out.print(n);
                        n++;
                    }

                    else
                    {
                        System.out.print(n);
                    }
                }
            }
            n = 1;
            System.out.println();
        }
        */


        // SHRADDHA DIDI WALA SOLUTION
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }        
    }
}