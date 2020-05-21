import java.util.*;

public class Question11_StringDecoding {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = in.nextLine();
        int key = in.nextInt();
        System.out.print(decode(key, s));
    }

    private static String decode(int key, String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if ((int) x + key > (int) 'z') {
                int a = (key + (int) x) - (int) 'z';
                a = (int) 'a' + a - 1;
                char fin = (char) a;
                s1.append(fin);
            } else {
                int a = (int) x + key;
                char fin = (char) a;
                s1.append(fin);
            }
        }
        return s1.toString();
    }
}
