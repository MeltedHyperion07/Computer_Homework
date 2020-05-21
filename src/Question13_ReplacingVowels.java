import java.util.*;

public class Question13_ReplacingVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        s=s.toLowerCase();
        StringBuilder s1= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                s1.append('*');
            }
            else{
                s1.append(s.charAt(i));
            }
        }
        System.out.println(s1);
    }
}

/*Sample Input:
Arjun Gupta
Sample Output:
*rj*n g*pt*
*/