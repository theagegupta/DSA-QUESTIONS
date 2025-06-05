// package DSA QUESTIONS.Recursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(3)); // passing value of n in 2xn floor

    }

    public static int tilingProblem(int n)
    {
        if(n==0 || n==1)   // Base case
        {
            return 1;
        }

        int fnm1 = tilingProblem(n-1);  // kaam kya karna h 
        int fnm2 = tilingProblem(n-2);

        return fnm1 + fnm2;   // return kya karna h 
    }
}
