//I have modified the basic recursive solution for Fibonacci Series.
// I have taken an array to store all the the ways we calculate the sum.
//If the same process is about to be repeated, the stored value is used directly, saving a lot of time
//Time complexity for Normal Recursion - O(2^N). For my Solution - O(N), which is much smaller.

import java.util.*;

public class Question5_Fibonacci {
    static Scanner in = new Scanner(System.in);
    static int n = in.nextInt();
    static int[] fib = new int[n + 1];
    public static int fibonacci(int n, int[] fib) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (fib[n] == 0) {
            fib[n] = fibonacci(n - 1, fib) + fibonacci(n - 2, fib);
        }
        return fib[n];
    }

    public static void main(String[] args) {
        fibonacci(n, fib);
        fib[1]=1;
        for(int i=0;i<n+1;i++){
            System.out.print(fib[i] + " ");
        }
    }
}

/*Sample Input:
10
Sample Output:
0 1 1 2 3 5 8 13 21 34 55
 */
