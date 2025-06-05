public class Patterns {
    static void pattern1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > n - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n * 2 - 1 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i <= 4) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }

            else {
                for (int j = 0; j < n - (i - n + 1); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 == 0 ? "1" : "0");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int k = 1; k <= (2 * n) - (2 * i); k++) {
                System.out.print(" " + " ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            char a = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
            }
            System.out.println();
            a++;
        }
    }

    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            char a = 'A';
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a++;
            }

            a--;
            for (int j = 2; j <= i; j++) {
                // a--;
                System.out.print(--a);

            }

            System.out.println();
        }

    }

    static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*" + " ");
            }

            for (int k = 0; k < i * 2; k++) {
                System.out.print("  ");
            }

            for (int l = i; l < n; l++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }

            for (int k = 0; k < 2 * n - 2 * i; k++) {
                System.out.print("  ");
            }

            for (int l = 0; l < i; l++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        // Butterfly Pattern
        System.out.println("Butterfly Pattern");
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i <= n) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*" + " ");
                }

                for (int k = 0; k < (n * 2) - (i * 2); k++) {
                    System.out.print(" " + " ");
                }

                for (int l = 0; l < i; l++) {
                    System.out.print("*" + " ");
                }
            }

            else {
                for (int j = 0; j < n - (i - n); j++) {
                    System.out.print("*" + " ");
                }

                for (int k = 0; k < (i - n) * 2; k++) {
                    System.out.print(" " + " ");
                }

                for (int l = 0; l < n - (i - n); l++) {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }

    static void pattern13(int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                System.out.print("*" + " ");

                else
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n)
    {
        for(int i =0;i<n*2-1;i++)
        {
            for(int j=0;j<n*2-1;j++)
            {
                int top = i;
                int left = j;
                int right = 2*n-2-j;
                int bottom = 2*n-2-i;
                int min_distance = Math.min(Math.min(top,bottom),Math.min(left,right));
                int value = n - min_distance;
                System.out.print(value+" ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(10);
        pattern2(10);
        pattern3(10);
        pattern4(5);
        pattern5(5);
        pattern6(4);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern12(5);
        pattern11(5);
        pattern13(5);
        pattern14(5);
    }
}
