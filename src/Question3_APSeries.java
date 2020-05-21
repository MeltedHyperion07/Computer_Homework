import java.util.*;

public class Question3_APSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();

        int currentTerm;
        currentTerm = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(currentTerm + " ");
            currentTerm = currentTerm + d;
        }
    }
}

/*
Sample Input:
10
2
5
Sample Output:
10 12 14 16 18
 */
