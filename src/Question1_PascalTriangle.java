import java.util.*;

public class Question1_PascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int C = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(C + " ");
                C = C * (i - j) / j;
            }
            System.out.println();
        }
    }
}