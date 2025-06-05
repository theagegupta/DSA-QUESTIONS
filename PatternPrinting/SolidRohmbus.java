// package questions.PatternPrinting;
// package questions.PatternPrinting;
class SolidRohmbus {
    public static void main(String[] args) {
        
        for(int i = 5; i>=1; i--)
        {
            for(int j = i-1; j >0 ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("****");
            System.out.println();
        }
    }
}