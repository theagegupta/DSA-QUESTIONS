// package questions.PatternPrinting;
class DiamondPattern {
    public static void main(String[] args) {
        int n = 10;
        upperHalf(n);
        lowerHalf(n);

    }

    public static void upperHalf(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i - 1; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void lowerHalf(int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n + i - 1; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}