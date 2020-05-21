import java.util.*;

public class Question12_AlphabeticalOrder {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = in.nextLine();
        int n = s.length();
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                c++;
            }
        }
        String[] word = new String[c+1];
        for(int i=0;i<c+1;i++){
            word[i]="";
        }
        int x = 0;
        s = " " + s;
        for (int i = 0; i <= n - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                for (int j = i + 1; j <= n; j++) {
                    if (s.charAt(j) == ' ') {
                        break;
                    } else {
                        word[x] += s.charAt(j);
                    }
                }
                x++;
                if(x>c){
                    x--;
                }
            }
        }
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (word[i].compareTo(word[j]) > 0) {
                    temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(word[i] + " ");
        }
        //System.out.print(word[n - 1]);
    }
}