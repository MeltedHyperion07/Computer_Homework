import java.util.*;

public class Question7_Spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int i, row = 0, column = 0;
        while (row < m && column < n) {
            for (i = column; i < n; ++i) {
                System.out.print(a[row][i] + " ");
            }
            row++;
            for (i = row; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (row < m) {
                for (i = n - 1; i >= column; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (column < n) {
                for (i = m - 1; i >= row; --i) {
                    System.out.print(a[i][column] + " ");
                }
                column++;
            }
        }
    }
}
