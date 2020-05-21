import java.util.*;

public class Question14_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Sum of all Elements: " + all(n, m, a));
        for (int i = 0; i < n; i++) {
            System.out.println("Sum of Column " + i + ": " + column(i, n, a));
        }
        System.out.println("Sum of Diagonal Elements: " + diagonal(n, a));
        System.out.println("Sum of Reverse Diagonal Elements: " + reverse(n, m, a));
    }

    static int all(int n, int m, int[][] a) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    static int column(int c, int n, int[][] a) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][c];
        }
        return sum;
    }

    static int diagonal(int n, int[][] a) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][i];
        }
        return sum;
    }

    static int reverse(int n, int m, int[][] a) {
        int sum = 0;
        int c = m - 1;
        for (int i = 0; i < n; i++) {
            sum += a[i][c];
            c--;
        }
        return sum;
    }
}
