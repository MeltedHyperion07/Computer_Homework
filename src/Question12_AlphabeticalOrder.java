import java.util.*;

public class Question12_AlphabeticalOrder {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = in.nextLine();
        s=s.toLowerCase();
        int n = s.length();
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                c++;
            }
        }
        String[] word = new String[c + 1];
        for (int i = 0; i < c + 1; i++) {
            word[i] = "";
        }
        int x = 0;
        s = " " + s;
        String s1 = "";
        for (int i = 0; i <= n - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                s1="";
                for (int j = i + 1; j <= n; j++) {
                    if (s.charAt(j) == ' ') {
                        break;
                    } else {
                        s1 += s.charAt(j);
                    }
                }
                word[x] = s1;
                x++;
            }
        }
        String temp;
        for (int i = 0; i < word.length - 1; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].compareTo(word[j]) > 0) {
                    temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
            }
        }
        for (String value : word) {
            System.out.print(value + " ");
        }
    }
}